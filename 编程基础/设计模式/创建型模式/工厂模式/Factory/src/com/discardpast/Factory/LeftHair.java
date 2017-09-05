package com.discardpast.Factory;

/**
 * Created by discardpast on 17-9-5.
 */
public class LeftHair implements HairInterface {

    //实现左偏分发型
    @Override
    public void draw() {
        System.out.println("实现左偏分发型！");
    }
}
