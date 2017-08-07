package com.discardpast.chapter_four.HQL.form;

import com.discardpast.chapter_three.Persistence.Commodity;
import com.discardpast.chapter_three.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by discardpast on 17-8-7.
 */

/**
 * from子句中持久化类的引用
 * 1.不需要引入持久化类的全限定名,直接引入类名
 * 2.auto-import(自动引入)缺省情况
 */
public class CommodityTest {

    private Session session = null;
    //private Transaction transaction = null;
    @Before
    public void setUp()
    {
        session = HibernateUtil.getSession();
        //transaction = session.beginTransaction();
    }
    @After
    public void tearDown()
    {
        //transaction.commit();
        HibernateUtil.closeSession(session);
    }
/*
    @Test
    public void addCommodity()
    {
        Date date = new Date(1993-06-04);
        Commodity commodity = new Commodity(1,"惠普笔记本", 4850.95,"个人嫩电脑","电脑","个人电脑");
        session.save(commodity);
    }*/
    @Test
    public void selectCommodity()
    {
        String hql = "from Commodity";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());

            //System.out.println("seller's name:" + commodity.getSeller().getName());
        }
    }
}
