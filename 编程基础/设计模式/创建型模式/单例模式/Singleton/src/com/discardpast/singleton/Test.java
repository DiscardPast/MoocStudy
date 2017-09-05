package com.discardpast.singleton;

/**
 * Created by discardpast on 17-9-4.
 */
public class Test {
    public static void main(String[] args)
    {
        /**
         * 饿汉模式
         */
        Singleton_Hungry s1 = Singleton_Hungry.getInstance();
        Singleton_Hungry s2 = Singleton_Hungry.getInstance();
        if(s1 == s2)
        {
            System.out.println("s1和s2是同一个实例");
        }
        else
        {
            System.out.println("s1和s2不是同一个实例");
        }

        /**
         * 懒汉模式
         */
        Singleton_Lazy s3 = Singleton_Lazy.getInstance();
        Singleton_Lazy s4 = Singleton_Lazy.getInstance();
        if(s3 == s4)
        {
            System.out.println("s1和s2是同一个实例");
        }
        else
        {
            System.out.println("s1和s2不是同一个实例");
        }

    }
}
