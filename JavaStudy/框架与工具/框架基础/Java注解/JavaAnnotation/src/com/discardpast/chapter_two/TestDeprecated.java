package com.discardpast.chapter_two;

/**
 * Created by discardpast on 17-7-24.
 */
public class TestDeprecated {
    @SuppressWarnings("deprecations")
    public void sing()
    {
        JDKAnnotation jdkAnnotation = new Test();
        jdkAnnotation.sing();
    }
}
