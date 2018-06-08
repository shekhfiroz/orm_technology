package com.apnacomplex.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import apnacomplex.society.entities.Society;

public class SocietyTest {

	public static void runProg() {
		Society society = null;
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// society = (Society) session.get(Society.class, 1000);

		society = (Society) session.load(Society.class, 1000);

		System.out.println("HbNet hashCode===>" + society.hashCode());
		System.out.println("HbNet Proxy Name===>" + society.getClass().getName());

		System.out.println(society.getSociety_no());

		/*
		 * System.out.println(society.getCity());
		 * System.out.println(society.getCountry());
		 */
		// System.out.println(society);

		
		sessionFactory.close();

	}
	public static void main(String[] args) {
		
		
	   runProg();
		
	}
}
