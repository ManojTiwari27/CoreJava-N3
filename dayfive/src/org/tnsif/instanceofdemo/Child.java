package org.tnsif.instanceofdemo;
// Program to demonstrate Instance of operator 
// Child Class
public class Child extends Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child() {
		super();
		
	}

	public Child(String name, String address,int age) {
		super(name, address);
		this.age=age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

}
