package com.discardpast.array_6_7;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by discardpast on 17-7-22.
 */
public class UseArrayClass {
    public static void main(String[] args)
    {
        int[] score = new int[]{61, 23, 4, 74, 13, 148, 20};

        //使用Arrays.Sort()方法排序
        Arrays.sort(score);

        //使用Arrays.toString()将数组元素转化为一组字符串
        String string_score = Arrays.toString(score);

        System.out.println(string_score);
    }
}
