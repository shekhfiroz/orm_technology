package com.idgen.bean.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idgen.beans.Store;
import com.idgen.helper.IdGenServiceRegistry;

public class IdGenTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = IdGenServiceRegistry.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Store store = new Store();
		
		store.setEmployee(103);
		store.setFranchise_name("salman");
		// store.setStore_id("kundoor");
		store.setStore_location("lucknow");
		store.setTotal_sale(10000000);
		session.save(store);
		transaction.commit();
		session.close();
	}

}
