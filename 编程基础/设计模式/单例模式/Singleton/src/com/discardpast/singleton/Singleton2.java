package com.discardpast.singleton;

/**
 * Created by discardpast on 17-9-4.
 */

/**
 * 懒汉模式
 */
public class Singleton2 {
    //1.将构造方法私有化,不允许外部直接创建对象
    private  Singleton2()
    {

    }

    //2.创建类的唯一实例,使用private static修饰
    private static Singleton2 instance;

    //3.提供一个用于或去市里的方法,使用public static修饰
    public static Singleton2 getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton2();
        }
            return instance;
    }
}
