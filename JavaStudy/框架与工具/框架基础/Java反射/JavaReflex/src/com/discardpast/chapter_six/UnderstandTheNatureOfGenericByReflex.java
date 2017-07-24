package com.discardpast.chapter_six;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by discardpast on 17-7-24.
 */


/**
 * 反射操作都是编译之后的操作
 * 编译之后集合的泛型是去泛型化的
 * java中集合的泛型是防止错误输入的，只在编译阶段，绕过编译就无效了
 * 利用方法的反射操作向list中插入之后，用foreach遍历list会出错
 */

public class UnderstandTheNatureOfGenericByReflex {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");

        System.out.println("使用普通操作向list中插入String值后list的长度:"+list.size());
        System.out.println("使用普通操作向list中插入String值后list中的值:" + list);
        //list只允许插入String类型的值
        //list.add(10);

        //通过方法反射操作向list中插入值
        Class c = list.getClass();
        try {
            Method m = c.getMethod("add",Object.class);
            try {
                m.invoke(list,10);
                m.invoke(list,100);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        System.out.println("使用反射操作向list中插入int值后list的长度:"+list.size());
        System.out.println("使用反射操作向list中插入int值后list中的值:" + list);


    }

}
