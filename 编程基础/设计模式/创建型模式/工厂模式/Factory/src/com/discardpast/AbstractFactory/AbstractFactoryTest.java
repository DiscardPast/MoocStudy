package com.discardpast.AbstractFactory;

/**
 * Created by discardpast on 17-9-5.
 */
public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        PersonalFactory factory = new MCFactory();
        Girl girl = factory.getGirl();
        girl.drawGirl();
        Boy boy = factory.getBoy();
        boy.drawBoy();

        PersonalFactory factory1 = new HNFactory();
        Girl girl1 = factory1.getGirl();
        girl1.drawGirl();
        Boy boy1 = factory1.getBoy();
        boy1.drawBoy();
    }
}
