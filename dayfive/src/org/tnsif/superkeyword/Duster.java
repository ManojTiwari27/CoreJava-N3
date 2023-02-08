package org.tnsif.superkeyword;
// Child class
public class Duster extends Renault {
	private int speed =220;
	public void print() {
		// It will call to parent method 
		super.print();
		System.out.println("The Speed of Duster is "+speed+"km/hr");
	}
}
