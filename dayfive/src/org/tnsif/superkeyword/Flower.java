package org.tnsif.superkeyword;
// Program to Demonstrate example on super keyword in terms of variable
public class Flower {
	// Data Members
	private String name;
	// getters and setters method
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	//Default Constructor
	public Flower() {
		super();
		System.out.println("This is flower class");
	}
	//parameterized Constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
	

}
