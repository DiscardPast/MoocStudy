package com.discardpast.chapter_four.HQL.form;

import com.discardpast.chapter_three.Persistence.Commodity;
import com.discardpast.chapter_three.Persistence.Customer;
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

    /**
     *
     * where语句测试
     */
    //比较运算
    @Test
    public void whereCommodity_Comparison()
    {
        String hql = "from Commodity c where c.description is not null";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("description:" + commodity.getDescription());
            System.out.println();
        }
    }

    //范围运算
    @Test
    public void whereCommodity_Range()
    {
        //not　between测试成功
        //between 不成功
        //原因暂不明确
        String hql = "from Commodity c where c.price between 1000 and 10";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("price:" + commodity.getPrice());
            System.out.println();
        }
    }

    //字符串模式匹配
    @Test
    public void whereCommodity_String()
    {
        //单字符s%有效,s_无效
        //字符串%set%有效
        //原因暂不明确
        String hql = "from Commodity c where c.util like 's%'";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("price:" + commodity.getPrice());
            System.out.println("util:" + commodity.getUtil());
            System.out.println();
        }
    }

    //逻辑运算符
    @Test
    public void whereCommodity_Calculation()
    {
        String hql = "from Commodity c where c.price between 100 and 5000 or c.category like '%computer%'";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("price:" + commodity.getPrice());
            System.out.println("util:" + commodity.getUtil());
            System.out.println();
        }
    }

    //集合运算
    @Test
    public void whereCommodity_Set()
    {
        String hql = "from Commodity c where c.seller is empty";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("price:" + commodity.getPrice());
            System.out.println("util:" + commodity.getUtil());
            System.out.println();
        }
    }
    //四则运算
    @Test
    public void whereCommodity_Quadrilateral()
    {
        String hql = "from Commodity c where c.price*5 >3000";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("price:" + commodity.getPrice()*5);
            System.out.println("util:" + commodity.getUtil());
            System.out.println();
        }
    }

    //查询单个对象
    //如果返回多个结果会报错
    @Test
    public void whereCommodity_uniqueResult()
    {
        String hql = "from Commodity c where c.price >4600";

        Query query = session.createQuery(hql);

        Commodity commodity = (Commodity) query.uniqueResult();

        System.out.println(commodity.getDescription());
    }

    //OrderBy子句测试
    @Test
    public void whereCommodity_OrderBy()
    {
        String hql = "from Commodity order by seller.id asc ,price desc ,name asc ";

        Query query = session.createQuery(hql);

        List<Commodity> commodityList = query.list();

        for (Commodity commodity:commodityList) {
            System.out.println("name:" + commodity.getName());
            System.out.println("SellerName:" + commodity.getSeller().getName());
            System.out.println("price:" + commodity.getPrice());
            System.out.println();
        }
    }
}
