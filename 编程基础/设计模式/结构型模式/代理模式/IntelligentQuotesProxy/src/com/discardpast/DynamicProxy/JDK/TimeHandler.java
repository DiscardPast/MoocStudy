package com.discardpast.DynamicProxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by discardpast on 17-9-5.
 */

/**
 * 所谓Dynamic Proxy是这样一种class:
 * 它是在运行时产生的class
 * 该class需要实现一组interface
 * 使用带胎代理类时，必须实现IvcocationHandler接口
 */

/**
 * 创建动态代理实现的步骤
 * 1.创建一个实现接口InvocationHandler的类，它必需实现invoke方法
 * 2.创建被代理的类及借口
 * 3.调用Proxy的静态方法，创建一个代理类newProxyInstance(ClassLoader loader,Class[] interfaces,InvocationHandler h)
 * 4.通过代理调用方法
 */
public class TimeHandler implements InvocationHandler {

    private Object object;

    public TimeHandler(Object object)
    {
        super();
        this.object = object;
    }


    /**
     *
     * @param proxy 被代理的对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return Object 方法的蛋会址
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("汽车开始行使...");
        method.invoke(object);
        System.out.println("汽车结束行使...");
        return null;

    }
}
