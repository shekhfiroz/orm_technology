package com.msf.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.msf.helper.HibernateSessionRepository;

public class SocietyAcessor {
	public Society getSocietyInformation(int societyId) {
System.out.println(".....1.....");		
		SessionFactory sessionFactory = HibernateSessionRepository.getSessionFactory();
System.out.println(".....3.....");		
		Session session = sessionFactory.openSession();
		Society society = (Society) session.get(Society.class, societyId);
		return society;

	}
}
