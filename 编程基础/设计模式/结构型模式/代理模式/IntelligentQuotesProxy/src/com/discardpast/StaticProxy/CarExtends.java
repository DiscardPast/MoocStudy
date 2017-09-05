package com.discardpast.StaticProxy;

/**
 * Created by discardpast on 17-9-5.
 */

/**
 * 继承实现代理
 */
public class CarExtends extends Car {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使...");
        super.move();

        long stopTime = System.currentTimeMillis();
        System.out.println("汽车结束行使...");
        System.out.println("汽车行使时间:"+ (stopTime-startTime) + "毫秒");

    }
}
