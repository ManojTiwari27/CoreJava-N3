package org.tnsif.staticdemo;

public class StaticBlockExecutor {

	public static void main(String[] args) {
		System.out.println(StaticBlock.getName());
		StaticBlock sb = new StaticBlock();
		sb.setNum(45);
		System.out.println(sb.getNum());

	}

}
