package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		List<Object> obj1 = new LinkedList<>();
		obj1.add(101);
		obj1.add(12.25);
		obj1.add('z');
		obj1.add(12.25);
		System.out.println("first List is"+obj1);
		System.out.println("size of list is "+obj1.size());
		System.out.println("checking size is Empty or not "+obj1.isEmpty());
		obj1.remove(1);
		System.out.println("After removing element list:"+obj1);
		System.out.println(obj1.contains(101));
		System.out.println("Element at Index 1:"+obj1.get(1));
		System.out.println("Index of z"+obj1.indexOf('z'));
		System.out.println("Last Index of 12.25 : "+obj1.indexOf(12.25));
		//obj1.clear();
		//System.out.println(obj1);
		//To Extract List Elements 
		for(Object iter:obj1) {
			System.out.print(iter+" ");
		}
		System.out.println();
		
		List<Integer> obj2 = new LinkedList<>();
		obj2.add(12);
		obj2.add(13);
		obj2.add(14);
		System.out.println("List 2 is "+obj2);
		//TO sort it in ascending order
		Collections.sort(obj2);
		System.out.println("sorted list is "+obj2);
		Collections.reverse(obj2);
		System.out.println("Reverse order of list "+obj2);

	}

}
