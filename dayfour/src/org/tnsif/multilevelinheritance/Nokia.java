package org.tnsif.multilevelinheritance;
//TO demonstrate example on Multilevel inheritance
public class Nokia {
	// Private data members
	private int modelno;
	public void display() {
		System.out.println("The Model no is "+modelno);
	}
	// Default Constructor
	public Nokia() {
		System.out.println("Nokia Class");
	}
	// Parameterized Constructor
	public Nokia(int modelno) {
		//super();
		this.modelno = modelno;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	

}
