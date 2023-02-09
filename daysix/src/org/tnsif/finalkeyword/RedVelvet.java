package org.tnsif.finalkeyword;

public class RedVelvet extends Cake{
	private int price;
	// We can't override final method 
	/*
	  if we try to override this method it will show errror 
	  like this:
	  void display() {
		System.out.println("Child Class");
	}
   */
	final void display(int price) {
		System.out.println("The price is "+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
