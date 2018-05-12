package com.dml.test;

import com.dml.beans.Owners;
import com.dml.beans.OwnersAcessor;

public class Test {
	public static void main(String[] args) {

		Owners owner = new Owners();
		owner.setAddress_line1("505");
		owner.setAddress_line2("Matrivanam");
		owner.setCity("Hyderbad");
		owner.setContact_no("9910");
		owner.setCountry("India");
		owner.setEmail_address("firozhere");
		owner.setOwner_first_nm("shekh");
		owner.setOwner_last_nm("firoz");
		owner.setOwner_no(2);
		owner.setState("Telengana");
		owner.setZip(500038);

		OwnersAcessor owneracessor = new OwnersAcessor();
		owneracessor.saveownersvehicle(owner);

		/*
		 * Owners owner1 = owneracessor.getownerinformation(5007); int owner2
		 * =owneracessor.saveownersvehicle(owner2); System.out.println(owner2);
		 */

	}

}
