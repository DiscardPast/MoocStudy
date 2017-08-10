package com.discardpast.chapter_two;

/**
 * Created by discardpast on 17-7-24.
 */

/**
 * @Override
 * 表示注释的方法必须是覆盖了父类的方法
 * @Deprecated
 * 表示注释的方法已过时,并会在调用时添加一条删除线样式
 * @SuppressWarnings("deprecations")
 * 如要调用已过时的方法则需要在调用该方法的方法上方添加该注释，可以消除warnings图标
 */
public class Test implements JDKAnnotation {
    @Override
    public String name() {
        return null;
    }

    @Override
    public int age() {
        return 0;
    }

    @Override
    public void sing() {

    }
}
