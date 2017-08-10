package com.discardpast.chapter_five;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by discardpast on 17-7-24.
 */
public class Test {
    public static void main(String[] args)
    {
        Filter filter1 = new Filter();
        Filter filter2 = new Filter();
        Filter filter3 = new Filter();

        filter1.setId(10);
        filter2.setUseName("lucy");
        filter3.setE_mail("liu@sina.com,zh@163.com,77777@qq.com");

        String sql1 = query(filter1);
        String sql2 = query(filter2);
        String sql3 = query(filter3);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);

        CompanyBean companyBean = new CompanyBean();
        companyBean.setCompany_city("hangzhou");
        companyBean.setCompany_id(1234567890);
        companyBean.setCompany_name("DiscardPast");
        companyBean.setCompany_peoples(10000);

        String sql = query(companyBean);

        System.out.println(sql);
    }
    private static String query(Object f)
    {
        StringBuilder sb = new StringBuilder();
        //获取Class
        Class c = f.getClass();
        //获取table的名字
        boolean exists = c.isAnnotationPresent(Table.class);
        if(!exists)
        {
            return null;
        }
        Table t = (Table)c.getAnnotation(Table.class);
        String tablename = t.value();
        sb.append("select * from ").append(tablename).append(" where 1=1");
        //遍历所有字段
        Field[] fArray = c.getDeclaredFields();
        for (Field field:fArray) {
            //处理每个字段对应的sql
            //拿到字段名
            boolean fExists = field.isAnnotationPresent(Column.class);
            if(!fExists)
            {
                continue;
            }
            Column column = field.getAnnotation(Column.class);
            String columnname = column.value();
            //拿到字段值
            String filedName = field.getName();
            String getMethodName = "get" + filedName.substring(0,1).toUpperCase()+filedName.substring(1);
            Object filedValue = null;
            try {
                Method getMethod = c.getMethod(getMethodName);
                filedValue = getMethod.invoke(f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //拼装sql
            if(filedValue==null || (filedValue instanceof Integer && (Integer)filedValue==0))
            {
                continue;
            }
            sb.append(" and ").append(filedName);
            if(filedValue instanceof String)
            {
                if(((String)filedValue).contains(","))
                {
                    String[] values = ((String)filedValue).split(",");
                    sb.append(" in(");
                    for (String s:values)
                    {
                        sb.append("'").append(s).append("'").append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    sb.append(")");
                }else
                {
                    sb.append("=").append("'").append(filedValue).append("'");
                }

            }else if(filedValue instanceof  Integer)
            {
                sb.append("=").append(filedValue);
            }

        }
        return sb.toString();
    }
}
