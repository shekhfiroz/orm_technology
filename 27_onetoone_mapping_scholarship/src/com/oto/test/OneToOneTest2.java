package com.oto.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.oto.beans.Admission;
import com.oto.beans.ScholarShip;
import com.oto.helper.SessionHandler;

public class OneToOneTest2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Admission admission = null;
		ScholarShip scholarShip = null;
		sessionFactory = SessionHandler.getSessionFactory();
		session = sessionFactory.openSession();
		transaction = session.beginTransaction();
		
		admission = new Admission();
		admission.setAdmissionDate("3-july-1018");
		admission.setAmount("50000");
		session.save(admission);
		try {
System.out.println("before close...");			
System.out.println(10/0);			

	
				//session.close();

			/*
			 * ScholarShip scholarShip = new ScholarShip();
			 * scholarShip.setSchoarshipName("central-government");
			 * scholarShip.setScholarshipType("full scholarship");
			 * scholarShip.setAmount(20000); scholarShip.setAdmission(admission);
			 * session.save(scholarShip);
			 */
			flag = true;
		} catch (Exception e) {
System.out.println("Inside Catch...");			
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			scholarShip = new ScholarShip();
			scholarShip.setSchoarshipName("central-government");
			scholarShip.setScholarshipType("full scholarship");
			scholarShip.setAmount(20000);
			scholarShip.setAdmission(admission);
			session.save(scholarShip);

			flag = true;
			e.printStackTrace();

		}

		finally {
System.out.println("Inside Finally...");			
			if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}

			}
			SessionHandler.closeSessionFactory();

		}
	}
