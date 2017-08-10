package com.discardpast.chapter_two;

/**
 * Created by discardpast on 17-7-24.
 */
public interface JDKAnnotation {
    public String name();
    public int age();

    @Deprecated
    public void sing();
}
