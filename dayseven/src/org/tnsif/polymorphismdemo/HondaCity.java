package org.tnsif.polymorphismdemo;
// Program to demonstrate on constructor overloading
public class HondaCity {
	private int speed;
	private String color;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// Constructor without Parameters 
	public HondaCity() {
		System.out.println("I like to drive Honda city");
	}
	// Constructor with Parameters 
	public HondaCity(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
		System.out.println("Speed is "+speed +" color is "+color);
	}
	
	

}
