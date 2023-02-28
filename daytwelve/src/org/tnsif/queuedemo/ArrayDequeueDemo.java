package org.tnsif.queuedemo;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		Deque<String> obj = new ArrayDeque<>();
		obj.add("Manoj");
		obj.addFirst("Pratik");
		obj.addLast("Sahil");
		System.out.println("Array Deque Elements are "+obj);
		System.out.println("Deque Elements are:");
		for(Object iter:obj) {
			System.out.print(iter+" ");
		}
		System.out.println();
		obj.remove();
		System.out.println("After using Remove "+obj);
		obj.removeFirst();
		System.out.println("After using RemoveFirst "+obj);
		obj.removeLast();
		System.out.println("After using RemoveLast "+obj);

	}

}
