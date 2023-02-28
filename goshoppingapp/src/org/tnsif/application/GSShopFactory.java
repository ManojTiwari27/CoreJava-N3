package org.tnsif.application;
import org.tnsif.framework.NormalAccount;
import org.tnsif.framework.PrimeAccount;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAccount getNewPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		
		GSPrimeAccount p=new GSPrimeAccount(accno,accnm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAccount getNewNormalAcc(int accno, String accnm, float charges, float deliveryCharges) {
		GSNormalAccount n=new GSNormalAccount(accno,accnm,charges,deliveryCharges);
		return n;
	}

}
