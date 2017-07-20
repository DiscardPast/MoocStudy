package com.discardpast.exercises_5_5;

import java.util.Scanner;

/**
 * Created by discardpast on 17-7-19.
 */
public class Average_Score {
    //班级名称
    String class_name;
    //班级数目
    int class_count;
    //学生人数
    int student_count;
    //学生姓名
    String student_name;
    //学生成绩
    int student_score;

    //学生对象
    Student[] student;
    //班级对象
    Student_Class[] student_class;

    //输入流对象
    Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Average_Score average_score = new Average_Score();
        average_score.get_Score();
        average_score.print(average_score.student_class);
    }

    public Student_Class[] get_Score()
    {
        System.out.print("请输入班级数目:");
        class_count = input.nextInt();
        student_class = new Student_Class[class_count];
        for(int i = 0;i < class_count;i++)
        {
            int i_sum = i+1;
            System.out.print("请输入第" + i_sum +"个班级的名称:");
            class_name = input.next();
            System.out.print("请输入该班学生人数:");
            student_count = input.nextInt();
            student = new Student[student_count];
            System.out.println();
            for(int j = 0;j < student_count;j++)
            {
                int j_sum = j+1;
                System.out.print("请输入第" + j_sum +"名同学的姓名:");
                student_name = input.next();
                System.out.print("请输入该同学的成绩:");
                student_score = input.nextInt();
                System.out.println();
                student[j] = new Student(student_name,student_score);
            }
            student_class[i] = new Student_Class(class_name,student,class_count,student_count);
        }
        return student_class;
    }

    public void print(Student_Class[] student_class)
    {
        System.out.println();
        System.out.println();
        System.out.println("**********************************");
        System.out.println("共有" + student_class.length +"个班级");
        for(int i = 0;i < student_class.length;i++)
        {
            int all_score = 0;
            int avge = 0;
            int i_sum = i+1;
            System.out.println("第" + i_sum +"个班级,"+ student_class[i].name + ",共有" + student_class[i].student_count +"个学生");
            for(int j = 0;j < student_class[i].student.length;j++)
            {
                int j_sum = j+1;
                System.out.println(student_class[i].name +"第" + j_sum +"个学生的姓名为:" + student_class[i].student[j].name);
                System.out.println(student_class[i].name +"第" + j_sum +"个学生的成绩为:" + student_class[i].student[j].score);
                all_score += student_class[i].student[j].score;
                avge = all_score/student_class[i].student_count;
                System.out.println();
            }
            System.out.println("该班平均成绩为:" + avge);
            System.out.println();
        }
    }
}
