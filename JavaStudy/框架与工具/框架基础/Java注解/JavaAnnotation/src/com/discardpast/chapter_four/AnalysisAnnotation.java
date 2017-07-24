package com.discardpast.chapter_four;

/**
 * Created by discardpast on 17-7-24.
 */

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 解析注解
 *   通过反射获取类，函数或成员上的运行时注解信息，从而实现动态控制程序运行的逻辑
 */
public class AnalysisAnnotation {
    public static void main(String[] args)
    {
        //使用类加载器加载类
        try {
            Class c = Class.forName("com.discardpast.chapter_four.Test");
            //找到类上面的注解
            boolean isExist = c.isAnnotationPresent(CustomizeAnnotation.class);
            if(isExist)
            {
                //拿到注释实例
                CustomizeAnnotation customizeAnnotation = (CustomizeAnnotation) c.getAnnotation(CustomizeAnnotation.class);
                System.out.println(customizeAnnotation.author() + " " +customizeAnnotation.desc());
            }
            //找到方法上的注解
            Method[] ms = c.getMethods();
            for (Method m:ms)
            {
                boolean isMexist = m.isAnnotationPresent(CustomizeAnnotation.class);
                if(isMexist)
                {
                    CustomizeAnnotation customizeAnnotation = (CustomizeAnnotation)m.getAnnotation(CustomizeAnnotation.class);
                    System.out.println(customizeAnnotation.author() + "  " +customizeAnnotation.age());
                }
            }
            //另一种解析方式
            for (Method m:ms)
            {
                Annotation[] as = m.getAnnotations();
                for (Annotation ann:as)
                {
                    if(ann instanceof CustomizeAnnotation)
                    {
                        System.out.println(((CustomizeAnnotation) ann).author() + " " +((CustomizeAnnotation) ann).desc() + " " + ((CustomizeAnnotation) ann).age());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
