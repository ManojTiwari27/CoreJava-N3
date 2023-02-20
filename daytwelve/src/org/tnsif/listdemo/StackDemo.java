package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> obj =new Stack<>();
		obj.push("Partik");
		obj.push("Sahil");
		obj.push("Saurabh");
		obj.push("Manoj");
		System.out.println("The Elements inside the stack are "+obj);
		obj.pop();
		System.out.println("The updated Elements inside the stack are "+obj);
	}

}
