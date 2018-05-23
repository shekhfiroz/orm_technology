package com.sr.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sr.beans.Event;
import com.sr.helper.ServiceAndServiceRegistryRepository;

public class StandardServiceTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = ServiceAndServiceRegistryRepository.getSessionFactory();
		Session session = sessionFactory.openSession();
		Event event = (Event) session.get(Event.class, 2);
		System.out.println(event);
	}

}
