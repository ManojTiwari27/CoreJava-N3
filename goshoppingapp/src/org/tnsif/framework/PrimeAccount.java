package org.tnsif.framework;

public abstract class PrimeAccount extends ShopAccount{
	private boolean isPrime;
	private static final float deliverycharges=0.0f;
	public PrimeAccount(int accno, String accnm, float charges,boolean isPrime) {
		super(accno, accnm, charges);
		this.isPrime=isPrime;
		
	}
	public void bookProduct(float charges) {
		System.out.println("Acc no"+this.getAccno()+" "+"Acc Name "+this.getAccnm()
		+" "+"Delivery Charges"+(this.getCharges()+this.deliverycharges));
	}
	@Override
	public String toString() {
		return "PrimeAccount [isPrime=" + isPrime + "]";
	}
	

}
