package org.tnsif.framework;

public abstract class ShopFactory {
	public abstract PrimeAccount  getNewPrimeAcc(int accno,String accnm,float charges,boolean isPrime);
	public abstract NormalAccount  getNewNormalAcc(int accno,String accnm,float charges,float deliveryCharges);
	

}
