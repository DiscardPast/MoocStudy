package com.discardpast.DynamicProxy.JDK;

import com.discardpast.StaticProxy.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by discardpast on 17-9-5.
 */
public class LogHandler implements InvocationHandler{

    private Object object;

    public LogHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始记录日志...");
        method.invoke(object);
        System.out.println("结束记录日志");
        return null;
    }
}
