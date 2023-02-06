package org.tnsif.encapsulationdemo;

public class HDFC {
	private int pin;

	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return pin;
	}
	void accept()
	{
		System.out.println("The pin is "+pin);
	}
	

}
