package org.tnsif.looping;
//Example on break
public class BreakDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			if(i==4) {
				break;
			}
		}

	}

}
