package com.discardpast.DynamicProxy.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by discardpast on 17-9-5.
 */
public class TrainCglib implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class cls){

        //设置创建子类的类
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /**
     * 拦截所有目标类方法的调用
     * @param o 目标类的实例
     * @param method 目标方法的反射对象
     * @param objects 方法的参数
     * @param methodProxy 代理类的实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        System.out.println("日志处理开始...");
        //代理类调用父类的方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("日志处理结束...");

        return null;
    }
}
