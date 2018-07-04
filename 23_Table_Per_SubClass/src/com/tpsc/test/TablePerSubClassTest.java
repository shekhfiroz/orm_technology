package com.tpsc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpsc.beans.FixedBidProject;
import com.tpsc.beans.Project;
import com.tpsc.beans.TimeBasedProject;
import com.tpsc.helper.SessionHandler;

public class TablePerSubClassTest {

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

			
			  Project project = new Project();
			  
			  project.setProjectId("one");
			  project.setProjctName("Highway Construction");
			  project.setDescription("its about bilding roads on highway");
			  project.setType("Gov Contract"); session.save(project);
			 

			FixedBidProject fbp = new FixedBidProject();

			fbp.setProjectId("1");
			fbp.setProjctName("Construction");
			fbp.setDescription("buildings");
			fbp.setType("PPP");
			fbp.setProjectDuration("3 months");
			fbp.setProjectCost(40000.9f);
			session.save(fbp);

			TimeBasedProject timebased = new TimeBasedProject();
			timebased.setProjectId("2");
			timebased.setProjctName("Wiring");
			timebased.setDescription(" proving the power");
			timebased.setType("private");
			timebased.setTotalCompletionTime("36 month");
			timebased.setPerHourRate("500");

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
