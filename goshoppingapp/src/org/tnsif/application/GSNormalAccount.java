package org.tnsif.application;
import org.tnsif.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges, deliverycharges);
		
	}

	@Override
	public String toString() {
		return "GSNormalAccount [toString()="+super.toString()+"]";
	}

	

	
	

}
