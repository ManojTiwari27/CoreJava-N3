package org.tnsif.finalkeyword;
//Parent class
public class Cake {
	protected String flavour;
	final void display() {
		System.out.println("Flavour of cake is "+flavour);
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	

}
