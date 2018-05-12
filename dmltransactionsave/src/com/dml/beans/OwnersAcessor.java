package com.dml.beans;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.dml.helper.HibernateSessionRepository;

public class OwnersAcessor {

	Transaction transaction = null;
	boolean flag = false;
	Session session = null;

	public Owners getownerinformation(int ownerId) {
		System.out.println(".....1.....");
		SessionFactory sessionFactory = HibernateSessionRepository.getSessionFactory();
		System.out.println(".....3.....");
		session = sessionFactory.openSession();
		Owners owners = (Owners) session.get(Owners.class, ownerId);
		return owners;
	}
	/*
	 * we are making owners acessor class to get the owners information by accepting
	 * owners_no from test class likewise we can create society accessor flat
	 * accessor and other accessor classes so all will
	 * this method is for transaction /Owners owner is acting as pojo class
	 */
	public int saveownersvehicle(Owners owner) {
		try {
			SessionFactory sessionFactory = HibernateSessionRepository.getSessionFactory();
			System.out.println(".....4....." + sessionFactory);
			Session session = sessionFactory.openSession();
			transaction = session.beginTransaction(); // session is act as factory method
			int pks = (int) session.save(owner);
			System.out.println(pks);
			flag = true;
			return pks;
		}	
			/*
			 * catch (HibernateException e) { e.printStackTrace(); }
			 */
		finally {
			if (transaction != null) {
				if (flag != false)
					transaction.commit();
				else
					transaction.rollback();
			}
			if (session != null) {
				session.close();
			}

		}

	}
}