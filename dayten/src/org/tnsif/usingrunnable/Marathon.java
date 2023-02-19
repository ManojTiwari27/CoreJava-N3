package org.tnsif.usingrunnable;
//program to demonstrate example on runnable interface 
public class Marathon implements Runnable{
	private int speed;
	private String city;
	//Runnable interface contains run() method by default
	@Override
	public void run() {
		System.out.println("Speed of the participant: "+speed+" The city is: "+city);
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
