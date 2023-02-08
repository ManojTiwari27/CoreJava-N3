package org.tnsif.thiskeyword;
class Account {
	int a;
	int b;
	
	public void setdata(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void showdata() {
		System.out.println("Value of A is "+a);
		System.out.println("Value of B is "+b);
	}

}
public class ThisKeywordDemo {
	public static void main(String[] args) {
		
		Account A1= new Account();
			A1.setdata(5, 4);
			A1.showdata();

	}
	
}
