package com.discardpast.chapter_four.HQL.form;

/**
 * Created by discardpast on 17-8-7.
 */

import com.discardpast.chapter_three.Persistence.Customer;
import com.discardpast.chapter_three.Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * form指定了HQL语句查询主体---持久化类及其属性
 */
public class CustomerTest {
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

/*    @Test
    public void addCustomer()
    {
        Date date = new Date(1993-06-04);
        Customer customer = new Customer(1,"客户一","15247853654","中国西安市","zhangsan@zhangsan.com","男","喜欢购物的程序员",24,date);
        session.save(customer);
    }*/
    @Test
    public void selectCustomer()
    {
        String hql = "from Customer";

        Query query = session.createQuery(hql);

        List<Customer> customerList = query.list();

        for (Customer customer:customerList) {
            System.out.println("name:" + customer.getName());
        }
    }
}
