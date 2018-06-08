package com.fjpa.test;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fjpa.entities.Products;

public class JpaormTest {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		boolean flag = false;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("hib");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Products products = new Products();
			products.setProduct_id(100);
			products.setPrice(1000);
			products.setName("book");
			products.setManufacture_date(new Date(2 - 11 - 2015));
			products.setExpiry_date(new Date(8 - 11 - 2019));
			entityManager.persist("hib");
			flag = true;
		} finally {
			System.out.println("finally stareted...");
			if (entityTransaction != null) {
				if (flag) {
					entityTransaction.commit();
					System.out.println("transication commited..");

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
