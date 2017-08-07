package com.discardpast.chapter_three.Junit;

import com.discardpast.chapter_three.Persistence.Seller;
import com.discardpast.chapter_three.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by discardpast on 17-7-31.
 */
public class SellerTest {
    private Session session = null;
    //private Transaction transaction = null;
/*
    @Test
    public void addSeller()
    {
        Seller seller = new Seller(1,"A服装店","12547896321","中国北京市","www.a.com","5","经营各类服装产品");
        session.save(seller);
    }*/
    @Test
    public void selectSeller()
    {
        //别名范例
        String hql = "from Seller as s,Customer c";

        Query query = session.createQuery(hql);

        List<Seller> sellerList = query.list();

        for (Seller seller:sellerList) {
            System.out.println(seller);
        }
    }

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


    /**
     * from子句中别名的应用
     * 1.为被查询的类指定别名
     * 2.在HQL语句通过其他部分别名应用该类
     * 3.别名命名习惯
     *      Seller类
     *   别名:seller
     *   单字母:s
     *   用法:Seller as seller | Seller as s
     *   as可省略
     *   如有多个类,语法如下:
     *   Seller s,Custormer c
     */
}
