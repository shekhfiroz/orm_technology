package com.hbl.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hbl.beans.Event;

public class ConfigurationFileTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("com\\hbl\\common\\organizer.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Event event = (Event) session.get(Event.class, 2);
		System.out.println(event);
	}

}
