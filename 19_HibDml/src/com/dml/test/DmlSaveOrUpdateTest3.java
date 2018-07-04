package com.dml.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.dml.entity.Doctor;
import com.dml.helper.DmlHelper;

public class DmlSaveOrUpdateTest3 {
	/*
	 * Dml methods to practice save() persist() update() saveUpdate() merge()
	 * delete()
	 */

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;

		boolean flag = false;
		try {
			sessionFactory = DmlHelper.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Doctor doctor = new Doctor();
			doctor.setDoctorId("2");
			doctor.setDoctorName("pachwa");
			doctor.setExperience("2");
			doctor.setQualification("MD Nero");
			doctor.setSpecilization("NueroScience");
			session.persist(doctor);

			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				session.close();
			}
			sessionFactory.close();
		}
	}

}
