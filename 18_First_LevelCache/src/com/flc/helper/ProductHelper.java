package com.flc.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ProductHelper {
	public static SessionFactory sessionFactory;
	static {
		try {
			sessionFactory = new MetadataSources(
					new StandardServiceRegistryBuilder().configure("/com/flc/commmon/hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();

		} catch (HibernateException e) {
			e.printStackTrace();

		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println("ProductHelper.getSessionFactory()");
		
		return sessionFactory;
	}

	public static void closeSession() {
		sessionFactory.close();
	}

}
