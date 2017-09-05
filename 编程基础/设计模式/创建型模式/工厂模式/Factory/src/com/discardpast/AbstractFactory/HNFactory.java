package com.discardpast.AbstractFactory;

/**
 * Created by discardpast on 17-9-5.
 */
public class HNFactory implements PersonalFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
