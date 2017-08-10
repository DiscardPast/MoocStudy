package com.discardpast.chapter_three.Junit;

import com.discardpast.chapter_three.Persistence.Seller;
import com.discardpast.chapter_three.Util.HibernateUtil;
import com.sun.javafx.collections.MappingChange;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

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
    public void fromSeller()
    {
        //别名范例
        //String hql = "from Seller as s,Customer c";
        String hql = "from Seller s";
        //select子句


        Query query = session.createQuery(hql);

        List<Seller> sellerList = query.list();

        for (Seller seller:sellerList) {
            System.out.println(seller);
        }
    }

    //select语句测试
    //通过对象数组返回查询结果
    @Test
    public void selectSellerByObjectArray()
    {
        //别名范例
        //String hql = "from Seller as s,Customer c";
        //如果在select子句只查询一个属性时返回的是对象类型而不是对象数组
        String hql = "select s.name ,s.tel,s.address,s.star from Seller s";


        Query query = session.createQuery(hql);

        List<Object[]> objectsList = query.list();

        for (Object[] objs:objectsList) {
            System.out.println("name:" + objs[0]);
            System.out.println("tel:" + objs[1]);
            System.out.println("address:" + objs[2]);
            System.out.println("star:" + objs[3]);
            System.out.println();
        }

    }

    //通过list返回查询结果
    @Test
    public void selectSellerByList()
    {
        String hql = "select new list(s.name ,s.tel,s.address,s.star) from Seller s";


        Query query = session.createQuery(hql);

        List<List> lists = query.list();

        for (List list:lists)
        {
            System.out.println("name:" + list.get(0));
            System.out.println("tel:" + list.get(1));
            System.out.println("address:" + list.get(2));
            System.out.println();
        }
    }

    //通过map返回查询结果
    @Test
    public void selectSellerByMap()
    {
        String hql = "select new map(s.name as name ,s.tel as tel,s.address as address,s.star as star) from Seller s";


        Query query = session.createQuery(hql);

        List<Map> maps = query.list();

        for (Map map:maps)
        {
            System.out.println("name:" + map.get("name"));
            System.out.println("tel:" + map.get("tel"));
            System.out.println("address:" + map.get("address"));
            System.out.println("star:" + map.get("star"));
            System.out.println();
        }
    }

    //通过自定义类型返回查询结果
    /**
     * 1.持久化类中定义对应的构造器
     * 2.select子句中调用定义的构造器
     */
    @Test
    public void selectSellerBySeller()
    {
        String hql = "select new Seller(s.name,s.tel,s.address) from Seller s";


        Query query = session.createQuery(hql);

        List<Seller> sellers = query.list();

        for (Seller seller:sellers)
        {
            System.out.println("name:" + seller.getName());
            System.out.println("tel:" + seller.getTel());
            System.out.println("address:" + seller.getAddress());
            System.out.println();
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
