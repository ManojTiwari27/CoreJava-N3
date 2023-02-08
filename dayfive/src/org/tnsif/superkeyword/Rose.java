package org.tnsif.superkeyword;
// Child Class
public class Rose extends Flower {
	private String name;
	// getters and setters method
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	//Default Constructor
	public Rose() {
		super();
		System.out.println("This is flower class");
	}
	//parameterized Constructor
	public Rose(String name) {
		super();
		this.name = name;
	}
	public void display()
	{
		System.out.println(name);
		super.setname("flower");
		System.out.println(super.getname());
	}
	


}
