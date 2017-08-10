package com.discardpast.exercises_5_5;

/**
 * Created by discardpast on 17-7-19.
 */
public class Student_Class {
    //班级名称
    String name;
    //班级学生
    Student[] student;
    //班级数目
    int class_count;
    //学生人数
    int student_count;

    public Student_Class(String name,Student[] student, int class_count,int student_count)
    {
        this.name = name;
        this.student = student;
        this.student_count = student_count;
        this.class_count = class_count;
    }
}
