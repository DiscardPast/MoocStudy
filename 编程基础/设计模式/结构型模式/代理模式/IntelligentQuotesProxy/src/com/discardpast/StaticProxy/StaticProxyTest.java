package com.discardpast.StaticProxy;

/**
 * Created by discardpast on 17-9-5.
 */
public class StaticProxyTest {

    public static void main(String[] args)
    {
        //普通模式
        //Car car = new Car();
        //car.move();


        //继承模式
        //Moveable car1 = new CarExtends();
        //car1.move();


        //聚合模式
        Car car2 = new Car();
        Moveable car3 = new CarPolymerizationTime(car2);
        car3.move();

    }
}
