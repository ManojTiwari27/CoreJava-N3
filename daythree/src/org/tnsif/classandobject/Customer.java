package org.tnsif.classandobject;

public class Customer {
	private int id;
	private String customer;
	private String city;
	
	// Default constructor
	/*public Customer() {
		super();
		
	}
	// Parametrized constructor
	
	public Customer(int id, String customer, String city) {
		super();
		this.id = id;
		this.customer = customer;
		this.city = city;
	
	void display()
	{
		System.out.println(id+" "+customer+" "+city);
	}
	}*/
	
	// Setter And getter Method 
	// Setter is used to set Value
	// getter is used to print Value
	public void setId(int id) {
		this.id = id;
	}
	public void getId() {
		System.out.println(id);
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public void getCustomer() {
		System.out.println(customer);
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void getCity() {
		System.out.println(city);
	}
	

}
