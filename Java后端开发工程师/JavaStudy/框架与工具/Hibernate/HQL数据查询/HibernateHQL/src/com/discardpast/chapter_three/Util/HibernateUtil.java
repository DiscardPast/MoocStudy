package com.discardpast.chapter_three.Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.internal.StandardSessionFactoryServiceInitiators;

/**
 * Created by discardpast on 17-7-31.
 */
public class HibernateUtil {

    private static Session session;
    private static SessionFactory sessionFactory;



    static
    {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder standardServiceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = standardServiceRegistry.build();
        sessionFactory = configuration.buildSessionFactory();
    }

    //获取SessionFactory
    public static SessionFactory getSessionFactory()
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
    public static void closeSession(Session session)
    {
        if(session != null)
        {
            session.close();
        }
    }
}
