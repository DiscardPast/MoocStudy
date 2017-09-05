package com.discardpast.StaticProxy;

/**
 * Created by discardpast on 17-9-5.
 */
/**
 * 聚合实现时间日志
 */
public class CarPolymerizationLog implements Moveable{

    private Moveable moveable;

    public CarPolymerizationLog(Moveable moveable)
    {
        super();
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("日志开始记录...");
        moveable.move();
        System.out.println("日志结束记录...");
    }
}
