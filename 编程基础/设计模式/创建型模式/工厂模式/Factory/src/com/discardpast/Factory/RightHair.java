package com.discardpast.Factory;

/**
 * Created by discardpast on 17-9-5.
 */
public class RightHair implements HairInterface {

    //实现右偏分发型
    @Override
    public void draw() {
        System.out.println("实现右偏分发型！");
    }
}
