package com.idgen.helper;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class IdGenServiceRegistry {

	public static SessionFactory sessionFactory;

	static {
		try {

			/*
			 * StandardServiceRegistryBuilder standardServiceRegistryBuilder = new
			 * StandardServiceRegistryBuilder().configure(
			 * "com\\metadata\\common\\organizer.cfg.xml"); StandardServiceRegistry
			 * standardServiceRegistry = standardServiceRegistryBuilder.build();
			 * 
			 * MetadataSources metaDataSources = new
			 * MetadataSources(standardServiceRegistry); MetadataBuilder metadataBuilder =
			 * metaDataSources.getMetadataBuilder(); Metadata metadata =
			 * metadataBuilder.build(); sessionFactory =
			 * metadata.getSessionFactoryBuilder().build();
			 */


			sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("com/idgen/common/hibernate.cfg.xml").build())
							.getMetadataBuilder().build().buildSessionFactory();

			System.out.println(sessionFactory);

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
