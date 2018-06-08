package com.apnacomplex.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import apnacomplex.society.entities.Society;

public class SocietyTest {

	public static void main(String[] args) {
		Society society = null;
		Configuration configuration = new Configuration().configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		society = (Society) session.get(Society.class, 1004);
		System.out.println(society);
		sessionFactory.close();
	}
}
