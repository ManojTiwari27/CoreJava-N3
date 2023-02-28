package org.tnsif.application;
import org.tnsif.framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount{

	public GSPrimeAccount(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSPrimeAccount [toString()="+super.toString()+"]";
	}

	

	
	

}
