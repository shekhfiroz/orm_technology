package com.dml.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DmlHelper {
	public static SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/dml/common/hibernate.cfg.xml").build())
					.getMetadataBuilder().build().buildSessionFactory();

		} catch (HibernateException e) {
			e.printStackTrace();

		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void closeSessionFactory(SessionFactory sessionFactory) {
		DmlHelper.sessionFactory = sessionFactory;
		sessionFactory.close();
	}

}
