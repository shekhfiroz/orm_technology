package com.msf.test;
import com.msf.beans.Owners;
import com.msf.beans.OwnersAcessor;
import com.msf.beans.Society;
import com.msf.beans.SocietyAcessor;
public class Test {

	public static void main(String[] args) {
		
		OwnersAcessor owneracessor= new OwnersAcessor();
		Owners owner1 = owneracessor.getownerinformation(5007);
		System.out.println(owner1);
		
		SocietyAcessor societyAcessor=new SocietyAcessor();
		Society society = societyAcessor.getSocietyInformation(1001);
		System.out.println(society);
	}

}
