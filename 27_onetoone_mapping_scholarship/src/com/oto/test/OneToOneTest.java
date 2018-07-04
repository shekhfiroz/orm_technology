package com.oto.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.beans.Admission;
import com.oto.beans.ScholarShip;
import com.oto.helper.SessionHandler;

public class OneToOneTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SessionHandler.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Admission admission = new Admission();
			admission.setAdmissionDate("3-july-1018");
			admission.setAmount("50000");
			session.save(admission);

			ScholarShip scholarShip = new ScholarShip();
			scholarShip.setSchoarshipName("central-government");
			scholarShip.setScholarshipType("full scholarship");
			scholarShip.setAmount(20000);
			scholarShip.setAdmission(admission);
			session.save(scholarShip);

			flag = true;

		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} // flag
				else {
					transaction.rollback();
				}

			}// trancestion
			SessionHandler.closeSessionFactory();

		}

	}
}
