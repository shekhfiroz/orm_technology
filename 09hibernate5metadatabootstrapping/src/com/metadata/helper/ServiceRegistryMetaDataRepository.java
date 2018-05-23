package com.metadata.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ServiceRegistryMetaDataRepository {

	public static SessionFactory sessionFactory;
	public static Configuration configuration;

	static {
		try {
			//getting all configuration metadata from configuration file
			configuration = new Configuration().configure("com\\sr\\common\\organizer.cfg.xml");
			
			//service registry builder object will be created
			ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
			
			//apply setting will get all the configuration seeting and getting all properties from get property method
			serviceRegistryBuilder.applySettings(configuration.getProperties());
			
			//calling build service registry
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
			
			//finally we get seessionFactory object by passing the reference of serviceRegistry as an argument
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println("..SessionRepository getMethod..");
		return sessionFactory;
	}

	public static void closeSession() {
		sessionFactory.close();
	}
}
