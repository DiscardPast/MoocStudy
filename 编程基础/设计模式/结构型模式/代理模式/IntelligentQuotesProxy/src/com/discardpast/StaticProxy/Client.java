package com.discardpast.StaticProxy;

/**
 * Created by discardpast on 17-9-5.
 */
public class Client {

    /**
     * 测试类
     */
    public static void main(String[] args)
    {
        Car car = new Car();
        CarPolymerizationTime carPolymerizationTime = new CarPolymerizationTime(car);
        CarPolymerizationLog carPolymerizationLog = new CarPolymerizationLog(carPolymerizationTime);
        carPolymerizationLog.move();
    }
}
