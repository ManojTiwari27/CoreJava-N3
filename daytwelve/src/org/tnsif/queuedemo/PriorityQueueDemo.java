package org.tnsif.queuedemo;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> obj = new PriorityQueue<>();
		//add and offer method is used to insert an element
		obj.offer(89);
		obj.add(65);
		obj.offer(75);
		obj.add(99);
		//Priority of the numbers is set by jvm in priority queue
		System.out.println("Queue Elements are:");
		for(Object iter:obj) {
			System.out.print(iter+" ");
		}
		System.out.println();
//		obj.remove();
//		obj.remove();
//		obj.remove();
//		obj.remove();
//		obj.remove();
		/*obj.poll();
		obj.poll();
		obj.poll();
		obj.poll();*/
		obj.poll();
		/*remove and poll both used to remove element but the
		difference is if we try to remove element from empty 
		queue it will give exception whether poll does not 
		give exception
		*/
		System.out.println("Queue Elements are:"+obj);
		//peek is used to retrieve first element of queue
		System.out.println("Head Elements is:"+obj.peek());

	}

}
