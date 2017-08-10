package com.discardpast.chapter_two.One_To_Many.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by discardpast on 17-7-28.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    private static Session session;

    static
    {
        //创建Configuration对象,加载hibernate.cfg.xml文件,完成初始化
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder.build();
        sessionFactory = configuration.buildSessionFactory();
    }
    //获取SessionFactory
    public  static  SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    //获取Session
    public static Session getSession()
    {
        session = sessionFactory.openSession();
        return session;
    }
    //关闭Session
    public  static  void closeSession(Session session)
    {
        if(session != null)
        {
            session.close();
        }
    }

}
