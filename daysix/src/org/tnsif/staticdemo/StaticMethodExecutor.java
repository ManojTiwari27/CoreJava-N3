package org.tnsif.staticdemo;

public class StaticMethodExecutor {

	public static void main(String[] args) {
		// Non Static Method
		/*
		StaticMethod s1 = new StaticMethod();
		s1.setSalary(7899.25);
		s1.display();*/
		// Static Method
		// for static method their is no need to create object we can call display method like this
		StaticMethod.display();

	}

}

