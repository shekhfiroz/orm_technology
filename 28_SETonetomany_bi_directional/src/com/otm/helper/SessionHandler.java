package com.otm.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionHandler {
	public static SessionFactory sessionFactory;

	static {
		try {

			sessionFactory = new MetadataSources(
					new StandardServiceRegistryBuilder().configure("com/otm/beans/common/hibernate.cfg.xml").build())
							.getMetadataBuilder().build().buildSessionFactory();
			/*
			 * Configuration configure = new
			 * Configuration().configure("com/tpsc/common/hibernate.cfg.xml");
			 * sessionFactory = configure.buildSessionFactory();
			 */

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println("sessionFactory....hanlder" + sessionFactory);
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		sessionFactory.close();
	}

}
