package org.tnsif.customexception;
// Program to demonstrate example on custom exception
public class LoginCredentials extends Exception {
	private String str;
	// Parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	

}
