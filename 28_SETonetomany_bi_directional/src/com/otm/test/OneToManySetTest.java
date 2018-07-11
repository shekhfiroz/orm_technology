package com.otm.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.beans.Blocks;
import com.otm.beans.Flats;
import com.otm.helper.SessionHandler;

public class OneToManySetTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Set<Flats> flats = new HashSet<>();

		try {
			sessionFactory = SessionHandler.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			Flats flat = new Flats();
			flat.setFlat_no(1);
			flat.setFlat_type("2 bhk");
			flat.setDescription("Marble flooring..");
			flat.setFacing("west");
			flat.setFloor_status("A");
			flat.setSqft("1400");
			//saving.. the flat
			flats.add(flat);
			session.save(flat);

			Blocks blocks = new Blocks();
			blocks.setBlock_no(2);
			blocks.setBlock_nm("Azad Apartment");
			blocks.setUnits("10");
			blocks.setDescription("well furnished appartment..");
			blocks.setFlats(flats);
			session.save(blocks);
			

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
