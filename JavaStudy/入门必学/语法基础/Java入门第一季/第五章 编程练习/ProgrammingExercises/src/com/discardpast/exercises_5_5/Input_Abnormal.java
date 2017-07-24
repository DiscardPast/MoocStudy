package com.discardpast.exercises_5_5;

import java.util.Scanner;

/**
 * Created by discardpast on 17-7-19.
 */
public class Input_Abnormal{
    static Scanner scanner;
    static int num;
    public static int input_int_abnormal()
    {
        scanner = new Scanner(System.in);
        try{
            num = scanner.nextInt();
        }catch (Exception e)
        {
            System.out.println("输入异常！请重新输入！");
            num = scanner.nextInt();
        }
        return num;
    }
    public static void input_String_abnormal(String string)
    {
        scanner = new Scanner(System.in);
        try{
            string = scanner.next();
        }catch (Exception e)
        {
            throw e;
        }finally {
            System.out.println("输入有误，请重新输入！");
            string = scanner.next();
        }
    }
}
