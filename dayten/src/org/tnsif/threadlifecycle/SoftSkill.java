package org.tnsif.threadlifecycle;

public class SoftSkill extends Thread {
	synchronized public void run() {
		System.out.println("Soft Skill Training");
		for(int i=1;i<=5;i++) {
			System.out.println(i+" ");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Soft Skill Session");
	}

}
