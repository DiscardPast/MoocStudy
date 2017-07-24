package com.discardpast.array_6_8;

/**
 * Created by discardpast on 17-7-22.
 */
public class UseForeach {
    public static void main(String[] args) {
        int[] scores = new int[]{61, 23, 4, 74, 13, 148, 20};
        //使用foreach循环遍历数组
        for (int score:scores) {
            System.out.println(" " + score);
        }
    }
}
