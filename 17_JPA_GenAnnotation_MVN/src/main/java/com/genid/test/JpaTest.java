package com.genid.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.genid.beans.Block;

public class JpaTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		boolean flag = false;

		try {
			System.out.println("JpaTest.main()");
			entityManagerFactory = Persistence.createEntityManagerFactory("blockname");

			entityManager = entityManagerFactory.createEntityManager();

			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			Block block1 = new Block();
			// block1.setBlock_no(101);
			block1.setBlock_name("Arif Asiana");
			block1.setDescription("3bhk flat for family");
			block1.setUnit("5");
			entityManager.persist(block1);
			flag = true;

		} finally {
			if (entityTransaction != null) {
				if (flag != false) {
					entityTransaction.commit();
				} else {
					entityTransaction.rollback();
				}
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (entityManagerFactory != null) {
				entityManagerFactory.close();
			}
		}
	}

}
