package com.msf.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionRepository {

	public static SessionFactory sessionFactory;

	static {
		try {
			/*
			 * we are creating configuration class object and calling builSessionFactory() method
			 * to store all metadata like hibernate cfg ,owners.hbm.xml in
			 * sessionFactory InterFace
			 */
			Configuration configuration = new Configuration().configure();
			sessionFactory = configuration.buildSessionFactory();
			// System.out.println("Configuration----->"+sessionFactory);

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println(".....HibernateSessionRepository.....");
		return sessionFactory;
	}

	public static void closeSession() {
		sessionFactory.close();
	}
}
