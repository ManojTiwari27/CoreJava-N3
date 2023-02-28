package org.tnsif.client;

import org.tnsif.application.GSNormalAccount;
import org.tnsif.application.GSPrimeAccount;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory f= new GSShopFactory();
		GSPrimeAccount p= new GSPrimeAccount(1234,"Pratik More",1050f,true);
		GSNormalAccount n= new GSNormalAccount(2224,"Manoj Tiwari",1050f,60f);
		System.out.println("Prime Account");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		System.out.println("Normal Account");
		System.out.println(n);
		n.bookProduct(n.getCharges());
	}
	

}
