package com.hbl.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hbl.beans.Event;

public class PropertiesFileTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
/*if we will not pass organizer.hbm.xml it will search in class path and get configuration info from hibernate.property and execute*/
		// configuration.configure("com\\hbl\\common\\organizer.cfg.xml");
//System.out.println("configuration" + configuration);
		
		configuration.addResource("com\\hbl\\beans\\event.hbm.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Event event = (Event) session.get(Event.class, 1);
		System.out.println(event);
	}

}
