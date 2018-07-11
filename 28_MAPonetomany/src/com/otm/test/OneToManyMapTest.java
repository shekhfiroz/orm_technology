package com.otm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.beans.Order;
import com.otm.beans.Product;
import com.otm.helper.SessionHandler;

public class OneToManyMapTest {
	private static Product product;

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Order order = null;
		Map<String, Product> map = new HashMap<String, Product>();

		try {
			sessionFactory = SessionHandler.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			product = new Product();
			product.setProductName("shoe");
			product.setProductType("mensshoe");
			product.setPrice("2000");
			// saving.. the product
			session.save(product);
			map.put("krhs...", product);

			product = new Product();
			product.setProductName("shirt");
			product.setProductType("men-shirt");
			product.setPrice("3000");
			// saving.. the product
			session.save(product);
			map.put("krish2...", product);

			order = new Order();
			order.setDeliveryDate(new Date());
			order.setShippingAddress("Ameerpet matrivanam");
			order.setProduct(map);
			session.save(order);

			flag = true;

		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} // flag
				else {
					transaction.rollback();
				}

			} // transaction
			SessionHandler.closeSessionFactory();

		}

	}
}
