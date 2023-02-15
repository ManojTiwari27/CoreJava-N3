package org.tnsif.threaddemo;

public class SynchronizationDemo {
	synchronized void print(int num) {
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
		}
	}

}
class ThreadOne extends Thread{
	SynchronizationDemo sd;

	public ThreadOne(SynchronizationDemo sd) {
		super();
		this.sd = sd;
	}
	public void run() {
		sd.print(10);
	}
	
}
class ThreadTwo extends Thread{
	SynchronizationDemo sd;

	public ThreadTwo(SynchronizationDemo sd) {
		super();
		this.sd = sd;
	}
	public void run() {
		sd.print(5);
	}
	
}