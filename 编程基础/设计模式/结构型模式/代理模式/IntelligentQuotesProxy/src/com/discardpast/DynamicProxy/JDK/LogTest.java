package com.discardpast.DynamicProxy.JDK;

import com.discardpast.StaticProxy.Car;
import com.discardpast.StaticProxy.Moveable;

import java.lang.reflect.Proxy;

/**
 * Created by discardpast on 17-9-5.
 */
public class LogTest {
    public static void main(String[] args)
    {
        Car car = new Car();
        LogHandler logHandler = new LogHandler(car);
        Class cls = car.getClass();

        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),logHandler);
        moveable.move();
    }

}
