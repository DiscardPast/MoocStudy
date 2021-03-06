package com.discardpast.chapter_one.junit;

/**
 * Created by discardpast on 17-7-28.
 */
/*
import com.discardpast.chapter_three.single_primary_key.MyAddress;
*/

import com.discardpast.chapter_three.component.MyAddress;
import com.discardpast.chapter_one.persistence.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.sql.Blob;
import java.util.Date;

/**
 * @Test
 *  测试方法
 * @Before
 *  初始化方法
 * @After
 *  释放资源
 */
public class StudentTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init()
    {
        //创建配置对象
        Configuration config = new Configuration().configure();
        //创建服务注册对象
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        //创建会话工厂
        sessionFactory = config.buildSessionFactory(serviceRegistry);
        //创建会话对象
        session = sessionFactory.openSession();
        //开启事务
        transaction = session.beginTransaction();
    }

    @After
    public void destory()
    {
        //提交事务
        transaction.commit();
        //关闭会话
        session.close();
        //关闭会话工厂
        sessionFactory.close();
    }

    @Test
    public void testSaveStudent()
    {
        //生成学生对象
        //Student student = new Student(6,"tony","boy",new Date(),"china");
        Student student = new Student();
        student.setAddress("Beijin");
        student.setBirthday(new Date());
        student.setSname("geloy");
        student.setGender("girl");
        //使用doWord()自动提交
        /*session.doWork(new Work(){

			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				connection.setAutoCommit(true);
			}
        });*/
        //保存对象
        session.save(student);
        //刷新
        //session.flush();
    }
    @Test
    public void testWriteBlob() throws Exception
    {
        Student student = new Student(6,"tony","boy",new Date(),"china");
        File f = new File("/home/discardpast/GitRemoteRepositories/MoocStudy/JavaStudy/框架与工具/Hibernate/Mylibrary" + File.separator + "test.jpg");
        InputStream inputStream = new FileInputStream(f);
        Blob image = Hibernate.getLobCreator(session).createBlob(inputStream, inputStream.available());
        //设置照片属性
        student.setPicture(image);
        //保存学生
        session.save(student);
        inputStream.close();
    }
    @Test
    public void testReadBlob() throws Exception
    {
        Student student = (Student)session.get(Student.class,7);
        Blob image = student.getPicture();
        InputStream inputStream = image.getBinaryStream();
        File file = new File("/home/discardpast/GitRemoteRepositories/MoocStudy/JavaStudy/框架与工具/Hibernate/Mylibrary" + File.separator +"gettest.jpg");
        OutputStream outputStream = new FileOutputStream(file);
        //创建缓冲区
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);
        outputStream.write(buff);
        inputStream.close();
        outputStream.close();
    }

    @Test
    public void testComponentMyAddress()
    {
        Student student = new Student();
        MyAddress myAddress = new MyAddress("124578","14725836996","hangzhou");
        student.setAddress("zhejiang");
        student.setBirthday(new Date());
        student.setMyAddress(myAddress);
        student.setGender("boy");
        student.setSid(10);
        session.save(student);
    }


    //CURD
    /*get与load的区别*/
    /*区别一*/
    /*在不考虑缓存的情况下,get方法会在调用之后立即向数据库发出sql预计,返回持久化对象*/
    /*load方法会在调用后但会一个代理对象*/
    /*该代理对象只保存了实体对象的id，直到使用对象的非主键属性时才会发出aql语句*/
   /*区别二*/
    /*查询数据库中不存在的数据时,get方法返回null，load方法抛出异常org.hibernate.ObjectNotFoundException*/
    @Test
    public void testGetStudent()
    {
        Student s = (Student)session.get(Student.class, 2);
        System.out.println(s.getClass().getName());
        System.out.println(s);
    }
    @Test
    public void testLoadStudent()
    {
        Student s = (Student)session.load(Student.class, 1);
        System.out.println(s.getClass().getName());
        System.out.println(s);
    }
    @Test
    public void testUpdateStudent()
    {
        Student s = (Student)session.get(Student.class, 2);
        s.setGender("girl");
        session.update(s);
        System.out.println(s);
    }
    @Test
    public void testDeleteStudent()
    {
        Student s = (Student)session.get(Student.class, 1);
        session.delete(s);
    }
}