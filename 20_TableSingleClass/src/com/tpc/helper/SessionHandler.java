package com.tpc.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class SessionHandler {
	public static SessionFactory sessionFactory;

	static {
		try {

			sessionFactory = new MetadataSources()
					.buildMetadata(
							new StandardServiceRegistryBuilder().configure("com/tpc/common/hibernate.cfg.xml").build())
					.buildSessionFactory();

			// Configuration configure = new
			// Configuration().configure("com/tpc/common/hibernate.cfg.xml");
			// sessionFactory = configure.buildSessionFactory();

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
