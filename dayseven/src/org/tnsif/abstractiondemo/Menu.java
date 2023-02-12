package org.tnsif.abstractiondemo;
/* Program to demonstrate example on abstract class
and abstract method*/
//Abstract class 
//Abstract Class cannot be final
public abstract class Menu {
	//Abstract Method
	abstract void recipe();
	abstract void foodtype();
	// Concrete Method
	void menuType() {
		System.out.println("Veg and Non Veg");
	}

}
