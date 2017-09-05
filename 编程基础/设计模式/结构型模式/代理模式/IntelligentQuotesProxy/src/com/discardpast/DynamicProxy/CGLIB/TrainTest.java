package com.discardpast.DynamicProxy.CGLIB;

/**
 * Created by discardpast on 17-9-5.
 */
public class TrainTest {

    public static void main(String[] args)
    {
        TrainCglib trainCglib = new TrainCglib();
        Train train = (Train) trainCglib.getProxy(Train.class);
        train.move();
    }
}
