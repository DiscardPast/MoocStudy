package com.discardpast.chapter_two.junit;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.jdbc.Work;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

import com.discardpast.chapter_one.persistence.Student;

/**
 * hibernate执行流程
 * @author discardpast
 *	1.Configuration(创建Configuration对象，读取Hibernate.cfg.xml)
 *  2.SessionFaction(创建SessionFaction,读取User.hbm.xml)
 *  3.Session(创建Session对象,获取数据库的链接对象)
 *  	同时创建一个Transaction对象
 *  	然后执行Session相关操作
 *  4.关闭Teansaction对象（teansaction.commit()），关闭Session对象(session.close())
 *  5.结束
 */

/**
 * Session简介
 * @author discardpast
 *	sission可以理解为操作数据库的对象
 *	session与connection，是多对一关系，每一个session都有一个与之对应的connection,一个connection不同时刻可以提供多个session使用
 *	把对象保存在关系数据库中需要调用session的各种方法,如:save()，update(),delete(),createQuery()等.
 *
 *	获得session对象
 *	 1.openSession
 *	 2.getCurrentSession
 *	 如果使用getCurrentSession需要在hibernate.cfg.xml文件中进行配置:
 *	 如果是本地事务(jdbc事务)
 *		<property name="hibernate.current_session_context_class">thread</property>
 *	 如果是全局事务(jta事务)
 *		<property name="hibernate.current_session_context_class">jta</property>
 *	 两者区别
 *	 1.getCurrentSession在事务提交或者回滚之后会自动关闭,而openSession需要你手动关闭.
 *	   如果使用openSession而没有手动关闭，多次之后会导致连接池溢出
 *   2.openSession每次创建新的session对象，getCurrentSession使用现有的Session对象
 */

/**
 * transaction简介(事务)
 * @author discardpast
 *	hibernate对数据的操作都是封装在事务当中，并且默认是非自动提交的方式。
 *	所以用session保存对象时,如果不开启事务,并且不手工提交事务,对象并不会真正保存在数据库中
 *	可以在保存对象之前使用session.doWork()来变成向jdbc那样自动提交事务，从而使对象保存组数据库中(但是一般不推荐这样做)
 */
public class SessionTest {

	@Test
	public void testOpenSession()
	{
		//获得配置对象
		Configuration config = new Configuration().configure();
		//获得服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//获得SessionFactory对象
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//获得Session对象
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		
		//flase
		System.out.println("openSession()" + (session1 == session2));
		/*if(session!=null)
		{
			System.out.println("session创建成功！");
		}
		else
		{
			System.out.println("session创建失败！");
		}*/
			
 	}
	@Test
	public void testGetCurrentSession()
	{
		//获得配置对象
		Configuration config = new Configuration().configure();
		//获得服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//获得SessionFactory对象
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//获得Session对象
		Session session1 = sessionFactory.getCurrentSession();
		Session session2 = sessionFactory.getCurrentSession();
		
		//true
		System.out.println("getCurrentSession()" + (session1 == session2));
		/*if(session!=null)
		{
			System.out.println("session创建成功！");
		}
		else
		{
			System.out.println("session创建失败！");
		}*/
	}
	@Test
	public void testSaveStudentWithOpenSession()
	{
		//获得配置对象
		Configuration config = new Configuration().configure();
		//获得服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//获得SessionFactory对象
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//获得Session对象
		Session session1 = sessionFactory.openSession();
		//开启事务
		Transaction transaction = session1.beginTransaction();
		Student student1 = new Student(1,"bob","girl",new Date(),"BeiJin");
		session1.doWork(new Work() {
			
			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("connection hashcode :" + connection.hashCode());
			}
		});
		session1.save(student1);
		//session1.close();
		//提交事务
		transaction.commit();
		
		Session session2 = sessionFactory.openSession();
		transaction = session2.beginTransaction();
		student1 = new Student(2,"bob2","girl",new Date(),"BeiJin");
		session2.doWork(new Work() {
			
			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("connection hashcode :" + connection.hashCode());
			}
		});
		session2.save(student1);
		transaction.commit();
	}
	@Test
	public void testSaveStudentWithgetCurrentSession()
	{
		//获得配置对象
		Configuration config = new Configuration().configure();
		//获得服务注册对象
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		//获得SessionFactory对象
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		//获得Session对象
		Session session1 = sessionFactory.getCurrentSession();
		//开启事务
		Transaction transaction = session1.beginTransaction();
		Student student1 = new Student(1,"bob","girl",new Date(),"BeiJin");
		session1.doWork(new Work() {
			
			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("connection hashcode :" + connection.hashCode());
			}
		});
		session1.save(student1);
		//session1.close();
		//提交事务
		transaction.commit();
		
		Session session2 = sessionFactory.getCurrentSession();
		transaction = session2.beginTransaction();
		student1 = new Student(2,"bob2","girl",new Date(),"BeiJin");
		session2.doWork(new Work() {
			
			@Override
			public void execute(Connection connection) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("connection hashcode :" + connection.hashCode());
			}
		});
		session2.save(student1);
		transaction.commit();
	}
}
