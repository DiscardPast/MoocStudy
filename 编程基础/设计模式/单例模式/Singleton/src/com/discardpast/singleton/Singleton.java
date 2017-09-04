package com.discardpast.singleton;

/**
 * Created by discardpast on 17-9-4.
 */

/**
 * 单例模式Singleton
 * 应用场合:有些对象只需要一个就足够了
 * 作用:保证整个应用程序中某个实例有且只有一个
 * 类型:饿汉模式,懒汉模式
 *
 * 饿汉模式和懒汉模式的区别:
 *      1.饿汉模式的特点是加载类时比较慢,但运行时获取对象的速度比较快,线程安全
 *      2.懒汉模式的特点是加载类时比较快,但运行时获取对象的速度比较慢,线程不安全
 */

/**
 * 饿汉模式
 */
public class Singleton {

    //1.将构造方法私有化,不允许外部直接创建对象
    private  Singleton()
    {

    }

    //2.创建类的唯一实例,使用private static修饰
    private static Singleton instance = new Singleton();

    //3.提供一个用于或去市里的方法,使用public static修饰
    public static Singleton getInstance(){
        return instance;
    }
}
