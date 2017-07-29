package com.discardpast.chapter_five;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by discardpast on 17-7-24.
 */
public class Method_Reflex_Operating {
    public static void main(String[] args)
    {
        //要获取print(int,int)方法
        //要获取一个方法就是获取类的信息，要获取类的信息就要获取类的类类型
        A a1 = new A();
        Class c = a1.getClass();
        /**
         * 2.获取方法 名称和参数列表来决定
         * getMedthod获取的是public的方法
         * getDelcaredMethod自己声明的方法
         */
        try {
            //Method m = (Method)c.getMethod("print",new Class[]{int.class,int.class});
            Method m = c.getMethod("print",int.class,int.class);

            //方法的反射操作
            //a1.print(10,20);方法的反射操作指使用m对象来进行方法调用和a1.print调用的效果是一样的
            //方法如果没有返回值返回null，如果有返回相应的返回值
            // m.invoke(a1,new Object[]{10,20});
            try {
                m.invoke(a1,10,20);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            Method m1 = c.getMethod("print",String.class,String.class);
            try {
                m1.invoke(a1,"hello ","WORLD");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
class A{
    public void print(int a,int b)
    {
        System.out.println(a+b);
    }
    public void print(String a,String b)
    {
        System.out.println(a.toUpperCase() + b.toLowerCase());
    }
}