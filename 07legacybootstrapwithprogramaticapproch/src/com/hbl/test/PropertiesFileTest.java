package com.hbl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hbl.beans.Event;
import com.hbm.helper.ProgramaticApprochHelper;

public class PropertiesFileTest {
	static Session session;
	static SessionFactory sessionFactory;

	public static void main(String[] args) {
		try {
			sessionFactory = ProgramaticApprochHelper.getSessionFactory();
			session = sessionFactory.openSession();
			Event event = (Event) session.get(Event.class, 2);
			System.out.println(event);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				System.out.println("inside CloseSession...");
				session.close();
			}
			if (sessionFactory != null) {
				System.out.println("inside CloseSessionFactory...");
				ProgramaticApprochHelper.closeSessionFactory();
			}
		}
	}
}
