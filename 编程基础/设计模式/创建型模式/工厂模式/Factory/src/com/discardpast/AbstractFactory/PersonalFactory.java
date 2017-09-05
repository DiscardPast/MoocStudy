package com.discardpast.AbstractFactory;

/**
 * Created by discardpast on 17-9-5.
 */

/**
 * 人物的实现接口
 */
public interface PersonalFactory {
    public Boy getBoy();
    public Girl getGirl();
}
