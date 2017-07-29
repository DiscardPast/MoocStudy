package com.discardpast.chapter_four;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * Created by discardpast on 17-7-24.
 */
public class GetMemberVariablesInfo {

    public static void main(String[] args)
    {
        String s = "hello";

        Integer integer = new Integer(12);
        print_member_variables_info(s);
        print_constructor_info(s);
    }

    /**
     * 获取成员变量的信息
     * 成员变量也是对象
     * java.lang.reflect.Field
     * Field类封装了关于成员变量的操作
     * getFields()方法获取的是所有的public的成员表了的信息
     * getDeclaredFields()获取的是该类自己生命的成员变量的信息
     * @param object
     */
    public static void print_member_variables_info(Object object)
    {
        System.out.println("打印对象的成员变量信息");
        Class c = object.getClass();
        Field[] fs = c.getDeclaredFields();
        for (Field field:fs)
        {
            //得到成员变量的类型的类类型
            Class fieldType = field.getType();
            //得到成员变量类类型的名称
            String typeName = fieldType.getName();
            //得到成员变量的名称
            String fieldName = field.getName();
            System.out.println(typeName + " " + fieldName);
        }
    }

    /**
     * 打印对象的构造函数的信息
     * @param object
     */
    public static void print_constructor_info(Object object)
    {
        System.out.println("打印对象的构造函数信息");

        Class c = object.getClass();
        /*
        构造函数也是对象
        java.lang.Constructor中封装了构造函数的信息
        getConstructor获取所有的public的构造函数
        getDeclasredConstructors得到所有的构造函数
         */
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor:cs)
        {
            System.out.print(constructor.getName() + "(");
            //获取构造函数的参数列表，得到的是参数类标的类类型
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class param:paramTypes)
            {
                System.out.print(param.getName() + ",");
            }
            System.out.println(")");
        }
    }
}
