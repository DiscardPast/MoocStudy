package com.discardpast.DynamicProxy.JDK;

import com.discardpast.StaticProxy.Car;
import com.discardpast.StaticProxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by discardpast on 17-9-5.
 */
public class TimeTest {
    public static void main(String[] args)
    {
        Car car = new Car();

        InvocationHandler h = new TimeHandler(car);
        Class<?> cls = car.getClass();


        /**
         * loader 类加载器
         * interfaces 是吸纳借口
         * h InvocationHandler
         */
        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),h);
        moveable.move();
    }
}
