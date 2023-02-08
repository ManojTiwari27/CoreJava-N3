package org.tnsif.thiskeyword;

class Finance{
	int salary;

	public Finance() {
		System.out.println("Default canstructor");
	}

	public Finance(int salary) {
		// Without this it will print 0
		this.salary = salary;
	}
	void print() {
		System.out.println("Salary is "+salary);
	}
	
	
}
public class ThiskeywordExampleConstructor {

	public static void main(String[] args) {
		Finance f1 = new Finance(50000);
		//System.out.println("Salary is "+f1.salary);
		f1.print();

	}

}
