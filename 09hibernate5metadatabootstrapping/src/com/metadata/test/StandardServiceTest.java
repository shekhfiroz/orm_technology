package com.metadata.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.metadata.beans.Event;
import com.metadata.helper.ServiceRegistryMetaDataRepository;

public class StandardServiceTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = ServiceRegistryMetaDataRepository.getSessionFactory();
		Session session = sessionFactory.openSession();
		Event event = (Event) session.get(Event.class, 2);
		System.out.println(event);
	}

}
