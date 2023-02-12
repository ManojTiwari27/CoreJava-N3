package org.tnsif.polymorphismdemo;

public class SBI extends RBI {
	// Overriding Parent class Method
	float getInterest() {
		System.out.println(super.getInterest());
		return 18.1f;
	}

}
