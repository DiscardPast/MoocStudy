package com.discardpast.chapter_four;

/**
 * Created by discardpast on 17-7-24.
 */
@CustomizeAnnotation(desc = "ClassAnnotation",author = "discardpast",age = 22)
public class Test {
    @CustomizeAnnotation(desc = "MethodAnnotation",author = "discardpast",age = 22)
    public void use_custonize_annotation()
    {

    }
}
