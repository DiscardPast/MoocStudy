package com.discardpast.chapter_two.One_To_Many;

/**
 * Created by discardpast on 17-7-28.
 */

import com.discardpast.chapter_two.One_To_Many.persistence.Grade;
import com.discardpast.chapter_two.One_To_Many.util.HibernateUtil;
import com.discardpast.chapter_two.One_To_Many.persistence.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * 单向一对多关联关系(班级--->学生)
 * 建立关联关系后,可以方便的从一个对象导航到另一个对象
 * 注意关联的方向
 */
public class Test_One_To_Many {
    //将学生添加到班级
    @Test
    public void add()
    {
        Grade grade = new Grade("GradeOne","班级测试一");
        Student student = new Student("StudentOne","Boy");
        Student student1 = new Student("StudentTwo","girl");

        Set<Student> students = new HashSet<Student>();
        students.add(student);
        students.add(student1);
        grade.setStudents(students);

        //如果希望在学生表中添加对应的班级编号,需要在班级中添加学生,建立关联关系
        /*grade.getStudents().add(student);
        grade.getStudents().add(student1);*/

        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.save(grade);
        session.save(student);
        session.save(student1);
        transaction.commit();
        HibernateUtil.closeSession(session);

    }
    //通过班级查找学生
    @Test
    public void findStudentByGrade()
    {
        Session session = HibernateUtil.getSession();
        Grade grade = session.get(Grade.class,2);
        System.out.println(grade.getGname()+","+grade.getGdesc()+","+grade.getGid());

        Set<Student> students = grade.getStudents();
        for (Student stu:students) {
            System.out.println(stu.getGid() + "," +stu.getSname()+","+stu.getSex() + "," + stu.getSid());
        }
        HibernateUtil.closeSession(session);
    }
    //更新学生信息
    @Test
    public void updateStudentInfo()
    {
        Grade grade = new Grade("GradeTwo","GradeTwo");

        Session session = HibernateUtil.getSession();
        Student student = session.get(Student.class,2);

        grade.getStudents().add(student);

        Transaction transaction = session.beginTransaction();
        session.save(grade);
        transaction.commit();
        HibernateUtil.closeSession(session);

    }
    //删除学生信息
    @Test
    public void deletStudentInfo()
    {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class,6);

        session.delete(student);
        transaction.commit();

        HibernateUtil.closeSession(session);
    }
}
