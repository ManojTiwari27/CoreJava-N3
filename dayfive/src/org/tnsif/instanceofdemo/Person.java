package org.tnsif.instanceofdemo;
// Program to demonstrate Instance of operator 
//Parent Class
public class Person {
	//Data Members 
	private String name;
	private String address;
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//Default Constructor 
	public Person() {
		super();
		System.out.println("parent Class");
		
	}
	//parameterized Constructor
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
