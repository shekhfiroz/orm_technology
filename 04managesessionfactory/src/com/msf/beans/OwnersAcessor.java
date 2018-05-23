package com.msf.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.msf.helper.HibernateSessionRepository;

public class OwnersAcessor {
	public Owners getownerinformation(int ownerId) {
		System.out.println(".....1.....");
		SessionFactory sessionFactory = HibernateSessionRepository.getSessionFactory();
		System.out.println(".....3.....");
		Session session = sessionFactory.openSession();
		Owners owners = (Owners) session.get(Owners.class, ownerId);
		return owners;
	}
	/*
	 * we are making owners acessor class to get the owners information by accepting
	 * owners_no from test class likewise we can create society accessor flat
	 * accessor and other accessor classes so all will
	 */
}
