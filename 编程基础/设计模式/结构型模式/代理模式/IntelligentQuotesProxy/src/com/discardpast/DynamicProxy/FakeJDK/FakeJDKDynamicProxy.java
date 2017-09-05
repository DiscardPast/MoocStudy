package com.discardpast.DynamicProxy.FakeJDK;

/**
 * Created by discardpast on 17-9-5.
 */

/**
 * 动态代理实现思路
 * 实现功能:通过Proxy的newProxyInstance返回代理对象
 *  1.声明一段源码（动态生产代理）
 *  2.编译源码(JDK Compiler API),产生新的类（代理类）
 *  3.将这个类load到内存当中,产生一个新的对象（代理对象）
 *  4.return 代理对象
 */
public class FakeJDKDynamicProxy {
    public static Object newProxyInstance(){


        return null;
    }
}
