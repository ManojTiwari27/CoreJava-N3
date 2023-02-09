package org.tnsif.staticdemo;

public class StaticVariableExecutor {

	public static void main(String[] args) {
		StaticVariable s1 = new StaticVariable("Manoj");
		System.out.println(s1);
		// Use classname.variable name to print static variable
		// for Static variable their is no need to create object of class
		System.out.println(StaticVariable.companyName);

	}

}
