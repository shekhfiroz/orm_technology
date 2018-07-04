package com.tpcc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpcc.beans.FixedBidProject;
import com.tpcc.beans.TimeBasedProject;
import com.tpcc.helper.SessionHandler;

public class TablePerConcreteClassTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			sessionFactory = SessionHandler.getSessionFactory();
			System.out.println("sessionFactory...." + sessionFactory);
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*
			 * Project project = new Project(); 
			 * project.setProjectId("one");
			 * project.setProjctName("Highway Construction");
			 * project.setDescription("its about bilding roads on highway");
			 * project.setType("Gov Contract"); session.save(project);
			 */

			FixedBidProject fbp = new FixedBidProject();

			fbp.setProjectId("one");
			fbp.setProjctName("civil-Construction");
			fbp.setDescription("buildings");
			fbp.setType("public-private");
			fbp.setProjectDuration("months");
			fbp.setProjectCost(40000.9f);
			session.save(fbp);

			TimeBasedProject timebased = new TimeBasedProject();
			timebased.setProjectId("two");
			timebased.setProjctName("Wiring");
			timebased.setDescription("proving the power");
			timebased.setType("public");
			timebased.setTotalCompletionTime("1 month");
			timebased.setPerHourRate("5000");
			session.save(timebased);

			flag = true;
		}

		finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				if (session != null)
					session.close();
			}
		} // finally
		SessionHandler.closeSessionFactory();

	}
}
