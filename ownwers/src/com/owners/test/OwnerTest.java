package com.owners.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.owners.entities.Owners;

public class OwnerTest {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Owners owner = (Owners) session.get(Owners.class,5001);
		System.out.println(owner);
		factory.close();
	}
}
