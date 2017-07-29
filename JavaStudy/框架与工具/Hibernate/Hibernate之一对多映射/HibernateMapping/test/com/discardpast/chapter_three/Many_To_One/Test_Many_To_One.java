package com.discardpast.chapter_three.Many_To_One;

import com.discardpast.chapter_two.One_To_Many.persistence.Grade;
import com.discardpast.chapter_two.One_To_Many.persistence.Student;
import com.discardpast.chapter_two.One_To_Many.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.HashMap;

/**
 * Created by discardpast on 17-7-29.
 */

/**
 * 单向多对一(学生--->班级)
 */

/**
 * 多对一的关系和数据库主外键参照关系最匹配,即在己方的表中的一个外键另一个表的主键
 *
 * 通过在多方持有一方的引用实现,需要在"多"的一端使用<many-to-one>配置
 */
public class Test_Many_To_One {
    //添加学生信息
    @Test
    public void addStudent()
    {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        Grade grade = new Grade(1,"GradeThree","GradeThree");

        Student student1 = new Student("Stu1","boy");

        Student student2 = new Student("Stu2","girl");

        //设置关联关系

        student1.setGrade(grade);
        student2.setGrade(grade);
        grade.getStudents().add(student1);
        grade.getStudents().add(student2);
        //级联操作
        //在保存grade信息时，应自动保存学生信息
        session.save(grade);
        //session.save(student1);
        //session.save(student2);

        transaction.commit();
        HibernateUtil.closeSession(session);
    }
    //由学生查找班级信息
    @Test
    public void findGradeByStudent()
    {
        Session session = HibernateUtil.getSession();
        Student student = session.get(Student.class,1);

        Grade grade = student.getGrade();
        System.out.println(grade.getGid() + "," + grade.getGname() + "," +grade.getGdesc());
        HibernateUtil.closeSession(session);
    }
}
