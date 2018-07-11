package com.otm.test;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.otm.beans.Blocks;
import com.otm.beans.Flats;
import com.otm.helper.SessionHandler;

public class OneToManyListTest {

	private static Blocks blocks;

	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		Flats flat = null;

		List<Flats> flats = new ArrayList<>();

		try {
			sessionFactory = SessionHandler.getSessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();

			/*flat = new Flats();
			flat.setFlat_no(1);
			flat.setFlat_type("2 bhk");
			flat.setDescription("Marble flooring..");
			flat.setFacing("west");
			flat.setFloor_status("A");
			flat.setSqft("1400");
			// saving.. the flat
			flats.add(flat);
			session.save(flat);

			flat = new Flats();
			flat.setFlat_no(2);
			flat.setFlat_type("3 bhk");
			flat.setDescription("Full Furnished..");
			flat.setFacing("east");
			flat.setFloor_status("NA");
			flat.setSqft("1600");
			// saving.. the flat
			flats.add(flat);
			session.save(flat);

			Blocks blocks = new Blocks();
			blocks.setBlock_no(2);
			blocks.setBlock_nm("New Apartment");
			blocks.setUnits("15");
			blocks.setDescription("well furnished appartment..");
			blocks.setFlats(flats);
			session.save(blocks);
			 */
			blocks = session.get(Blocks.class, 1);
			System.out.println(blocks);
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
