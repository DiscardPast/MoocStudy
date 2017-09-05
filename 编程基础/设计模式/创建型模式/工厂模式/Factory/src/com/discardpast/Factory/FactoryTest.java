package com.discardpast.Factory;

/**
 * Created by discardpast on 17-9-5.
 */

import java.util.Map;
import java.util.Properties;

/**
 * 模拟客户端的实现
 */
public class FactoryTest {
    public static void main(String[] args)
    {
        //普通创建
        HairInterface left = new LeftHair();
        left.draw();
        HairInterface right = new RightHair();
        right.draw();


        //工厂模式创建
        HairFacroty hairFacroty = new HairFacroty();
        HairInterface left1 =  hairFacroty.getHair("left");
        left.draw();

        //通过类名工厂调用
        HairInterface left2 = hairFacroty.getHairByClass("com.discardpast.Factory.LeftHair");
        left2.draw();

        //通过property映射文件读取类名
        HairInterface hair = hairFacroty.getHairByClassKey("middle");
        hair.draw();

    }
}
