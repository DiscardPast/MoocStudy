package com.discardpast.AbstractFactory;

/**
 * Created by discardpast on 17-9-5.
 */
public class MCFactory implements PersonalFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
