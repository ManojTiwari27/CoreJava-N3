package org.tnsif.thiskeyword;

class Mathematics{
	int a,b;

	public Mathematics() {
		a=10;
		b=20;
	}
	Mathematics accept(){
		return this;
	}
	void display() {
		System.out.println("A is "+a+" B is "+b);
	}
	

}
public class ThisKewordRunner {

	public static void main(String[] args) {
		Mathematics m1 = new Mathematics();
		m1.accept().display();
		

	}

}
