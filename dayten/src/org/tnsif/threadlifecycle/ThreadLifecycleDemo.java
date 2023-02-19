package org.tnsif.threadlifecycle;

public class ThreadLifecycleDemo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Tech t = new Tech();
		SoftSkill s = new SoftSkill();
		t.start();
		t.yield();
		s.start();

	}

}
