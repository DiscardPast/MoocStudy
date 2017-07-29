package com.discardpast.chapter_three;

/**
 * Created by discardpast on 17-7-24.
 */

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 基本的数据类型
 * void关键字 都存在类类型
 *
 * Class类的基本API操作
 */
public class GetClassMethodInfo {

    public static void main(String[] args)
    {


        //int的类类型
        Class c1 = int.class;
        //String类的类类型 String类的字节码
        Class c2 = String.class;
        Class c3 = double.class;
        Class c4 = Double.class;
        Class c5 = void.class;


        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c2.getSimpleName());


        String s = "Hello";
        print_class_info(s);
    }

    /**
     * 打印类的信息，包括类的成员函数
     * @param object 该对象所属类的信息
     */
    public static void print_class_info(Object object)
    {
        //要获取类的信息 首先要获取类的类类型
        //传递的是哪个子类的对象 c就是该子类的类类型
        Class c = object.getClass();
        //获取类的名称
        System.out.println("类的名称是:" + c.getName());
        //获取类的所有方法
        /*
        Method类，方法对象
        getMedthods()方法获取的是所有的public的函数，包括从父类继承来的
        getDeclaredMedthods获取的是所有该类自己声明的方法,不问访问权限
         */
        Method[] ms = c.getMethods();
        for(int i = 0;i < ms.length;i++)
        {
            //得到方法的返回值的类类型
            Class returnType = ms[i].getReturnType();
            System.out.print(returnType.getName() + "");
            //得到方法的名称
            System.out.print(ms[i].getName() + "(");
            //获取参数类型--->得到参数列表的类型的类类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for(int j = 0;j < paramTypes.length;j++)
            {
                System.out.print(paramTypes[j].getName() + ",");
            }
            System.out.println(")");
        }


    }
}
