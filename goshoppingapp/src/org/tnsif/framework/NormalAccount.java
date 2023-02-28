package org.tnsif.framework;

public abstract class NormalAccount extends ShopAccount {
	final private float deliverycharges;

	public NormalAccount(int accno, String accnm, float charges,float deliverycharges) {
		super(accno, accnm, charges);
		this.deliverycharges=deliverycharges;
	}

	@Override
	public String toString() {
		return "NormalAccount [deliverycharges=" + deliverycharges + "]";
	}
	
	public void bookProduct(float charges) {
		System.out.println("Acc no"+this.getAccno()+" "+"Acc Name "+this.getAccnm()
		+" "+"Delivery Charges"+(this.getCharges()+this.deliverycharges));
	}

	

}
