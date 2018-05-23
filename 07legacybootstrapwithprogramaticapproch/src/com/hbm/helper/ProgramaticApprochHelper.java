package com.hbm.helper;

import java.io.IOException;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProgramaticApprochHelper {
	private static SessionFactory sessionFactory;
	static {
		/*
		 * we are reading database credentials from properties file and we are reading
		 * that property file with the help of ProgramaticApprochHelper class and
		 */
		try {
			Properties props = new Properties();
			// read properties file from classpath resource by classloader
			props.load(ProgramaticApprochHelper.class.getClassLoader()
					.getResourceAsStream("externaldbproperties.properties"));

			System.out.println(">>>>>" + props.getProperty("krishna"));

			Configuration configuration = new Configuration();
			configuration.setProperty("hibernate.connection.driver_class", props.getProperty("krishna"));
			configuration.setProperty("hibernate.connection.url", props.getProperty("firoz"));
			configuration.setProperty("hibernate.connection.username", props.getProperty("faiz"));
			configuration.setProperty("hibernate.connection.password", props.getProperty("nizaam"));
			configuration.setProperty("hibernate.dialect", props.getProperty("ankit"));
			
			configuration.addResource("com\\hbl\\beans\\event.hbm.xml");
			sessionFactory = configuration.buildSessionFactory();

		} catch (HibernateException | IOException e) {
			e.printStackTrace();
		}
	}

	public static SessionFactory getSessionFactory() {
		System.out.println(".....HibernateSessionRepository.....");
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}

}