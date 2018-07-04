package com.flc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.flc.beans.Products;
import com.flc.helper.ProductHelper;

public class ProductTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductHelper.getSessionFactory();
		Session session = sessionFactory.openSession();
		Products products1=	session.get(Products.class, 1);
		Products products2=	session.get(Products.class, 2);
		//session.evict(products1);
		session.clear();
		System.out.println();
		
		Products products3=	session.get(Products.class,3);
		
        /*System.out.println("ProductTest.main()...............>>>>");
        System.out.println(products1);*/
	}

}
