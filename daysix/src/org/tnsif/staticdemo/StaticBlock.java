package org.tnsif.staticdemo;

public class StaticBlock {
	// Non static Variable
	private int num;
	//Static Variable
	private static String name;
	// Static Block
	//Static Block is used to initialize static variable
	static {
		// num = 12;  It will give error because static block is used to initalize static variable only
		name="Manoj";
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
}
