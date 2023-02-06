package org.tnsif.accessspecifierdemo;

public class AccessSpecifierExaple {
	/*public String name;
	void display()
	{
		System.out.println(name);
	}*/
	String name2;
	void display2()
	{
		System.out.println(name2);
	}
	
	private String name;
	

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public String getName2() {
		return name2;
	}
	
	

}
