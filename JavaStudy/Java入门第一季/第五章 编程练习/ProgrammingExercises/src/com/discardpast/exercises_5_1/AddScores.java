package com.discardpast.exercises_5_1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by discardpast on 17-7-18.
 */
public class AddScores {
    public static void main(String[] args)
    {
        //加分前成绩
        int start_score = 0;
        //加分后成绩
        int end_score = 60;
        //加分次数
        int times = 0;

        //输入流对象
        Scanner input = new Scanner(System.in);

        System.out.print("请输入加分前成绩:");
        start_score = input.nextInt();

        //逻辑判断
        if(start_score < end_score)
        {
            for(int i = start_score;i < end_score;i++)
            {
                times++;
            }
        }else
        {
            end_score = start_score;
        }
       print(start_score,end_score,times);
    }

    //打印输出
    public static void print(int start_score, int end_score, int times)
    {
        System.out.println("加分前成绩:" + start_score);
        System.out.println("加分后成绩:" + end_score);
        System.out.println("加分次数:" + times);
    }
}
