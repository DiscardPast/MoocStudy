package com.discardpast.chapter_one;

/**
 * Created by discardpast on 17-7-24.
 */

/**
 * 1.在面向对象的世界里，万事万物皆对象
 *   类是java.lang.Class类的实例对象
 * 2.类也是对象，是Class类的对象，我们称该对象为该类的类类型
 */
public class ClassUse {
    public static void main(String[] args)
    {
        //Foo的实例对象
        Foo foo = new Foo();


        //Class类的实例对象表示方式
        //Foo类的类类型
        //第一种方式-->实际在告诉我们任何一个类都有一个隐藏的静态成员变量class
        Class c1 = Foo.class;
        //第二种方式-->一直该类对象通过getClass方法
        Class c2 = foo.getClass();

        System.out.println(c1==c2);

        //第三种方式-->使用类的完整路径(类的全称)通过forName方法创建该类的类类型
        try {
            Class c3 = Class.forName("com.discardpast.chapter_one.Foo");
            System.out.println(c2==c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //我们完全可以通过类的类类型来创建该类的对象
        try {
            Foo foo1 = (Foo)c1.newInstance();
            foo1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
class Foo{
    void print(){
        System.out.println("Foo");
    }
}