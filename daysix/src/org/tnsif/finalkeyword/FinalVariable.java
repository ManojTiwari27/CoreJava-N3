package org.tnsif.finalkeyword;
//Program to demonstarte example on finaal keyword
public class FinalVariable {
	// Final keyword is used to restrict the user
	//we can't change the value of variable if it is declared with fianl keword
	// It is neccesary to initialize variable which has final keyword
	final static int x = 50;
	public static void print() {
		/*
		x=78;
		we can get error here because we can't change the value 
		of variable because it is declared as a final
		*/
		
		System.out.println("The value of x is "+x);
	}
	public static void main(String args[]) {
		FinalVariable.print();
	}

}
