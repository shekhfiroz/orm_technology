package com.tpc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpc.beans.CardPayment;
import com.tpc.beans.ChequePayment;
import com.tpc.beans.Payment;
import com.tpc.helper.SessionHandler;

public class TableSingleClassTest {

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

			Payment payment = new Payment();

			payment.setPaymentDate("18-june-18");
			payment.setPaymentType("cash");

			session.save(payment);

			ChequePayment chequePayment = new ChequePayment();
			chequePayment.setPaymentDate("10-12-18");
			chequePayment.setPaymentType("dd");
			chequePayment.setChequeissueDate("23-june-18");
			chequePayment.setChequeNo("as123");
			chequePayment.setAmount(1234.4f);
			session.save(chequePayment);

			CardPayment cardPayment = new CardPayment();

			cardPayment.setPaymentDate("10-21-18");
			cardPayment.setPaymentType("in hand");
			cardPayment.setCardNos("8978");
			cardPayment.setCardAccountNo("spring");
			cardPayment.setExpiryDate("12-nov-2018");
			cardPayment.setCardLimit("500000");
			session.save(cardPayment);

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
