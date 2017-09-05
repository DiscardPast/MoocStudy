package com.discardpast.StaticProxy;

/**
 * Created by discardpast on 17-9-5.
 */

/**
 * 聚合实现时间代理
 */
public class CarPolymerizationTime implements Moveable{

    private Moveable moveable;

    public CarPolymerizationTime(Moveable moveable)
    {
        super();
        this.moveable = moveable;
    }

    @Override
    public void move() {
        //long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行使...");
        moveable.move();
        //long stopTime = System.currentTimeMillis();
        System.out.println("汽车结束行使...");
        //System.out.println("汽车行使时间:"+ (stopTime-startTime) + "毫秒");

    }
}
