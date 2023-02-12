package org.tnsif.polymorphismdemo;

public class RBI {
	float getInterest() {
		return 10.8f;
	}
	/*
 If we use method overriding in same class we will get the error
	float getInterest() {
		return 18.1f;
	}
	*/

}
