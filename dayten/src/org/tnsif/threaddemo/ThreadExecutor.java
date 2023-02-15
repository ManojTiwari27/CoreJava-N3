package org.tnsif.threaddemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		SimpleThreadProgram st = new SimpleThreadProgram();
		st.setName("New Thread");
		st.setPriority(5);
		/* When thread calls to start method it will come to run method  */
		st.start();
		/*once we call start method again we can't restart
		 * st.start();
		 */
		System.out.println("current thread"+st);

	}

}
