package com.discardpast.array_6_6;

/**
 * Created by discardpast on 17-7-22.
 */
public class Array_test {

    //定义数组并赋初值
    static int[] score = new int[]{61, 23, 4, 74, 13, 148, 20};

    public static void main(String[] args)
    {

        Array_test array_test = new Array_test();
        array_test.print_MAX(score);
        array_test.print_MIN(score);
        array_test.print_AVGE(score);
        array_test.print(score);
    }

    //输出数组中的最大值
    public void print_MAX(int[] array){

        //定义交换变量
        int temp = 0;

        for(int i = 0;i < array.length-1;i++)
        {
            for(int j = 0;j < array.length-1;j++)
            {
                if(array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


        //该数组最大值
        System.out.println("数组最大值为" + array[0]);
    }

    //输出数组中的最小值
    public void print_MIN(int[] array){

        //定义交换变量
        int temp = 0;

        for(int i = 0;i < array.length-1;i++)
        {
            for(int j = 0;j < array.length-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //该数组最大值
        System.out.println("数组最小值为" + array[0]);
    }

    //输出数组的平均值
    public void print_AVGE(int[] array)
    {
        //数组的值的总和
        int sum = 0;
        //数组的平均值
        int avge = 0;

        for(int i = 0;i < array.length;i++)
        {
            sum += array[i];
        }

        avge = sum/array.length;

        System.out.println("该数组的平均值为:" + avge);
    }

    //简易方案
    public void print(int[] array)
    {
        //假定最大值为数组中的第一个元素
        int MAX = array[0];
        //假定最小值为数组中的第一个元素
        int MIN = array[0];
        //平均值
        int AVGE = 0;
        //总和
        int SUM = 0;

        for(int i = 0;i <array.length;i++)
        {
            if(MAX  < array[i])
            {
                MAX = array[i];
            }
            if(MIN > array[i])
            {
                MIN = array[i];
            }
            SUM += array[i];
        }
        AVGE = SUM/array.length;

        System.out.println("**********简易方案××××××××××");
        System.out.println("该数组的最大值为" + MAX);
        System.out.println("该数组的最小值为" + MIN);
        System.out.println("该数组的平均值为" + AVGE);
    }
}
