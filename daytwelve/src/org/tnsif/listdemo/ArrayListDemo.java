package org.tnsif.listdemo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//Program to demonstrate example on ArrayList 
public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		/*Collection is an interface we can'tcrreate an 
		 * object for a collection
		 */
		//Collection obj = new Collection<>();
		@SuppressWarnings("rawtypes")
		Collection obj = new ArrayList<>();
		obj.add(101);
		obj.add(12.25);
		obj.add('z');
		System.out.println("First List is"+obj);
		//List2
		List<Object> obj1 = new ArrayList<>();
		/*
		obj.add(101);
		obj.add(12.25);
		obj.add('z');*/
		obj1.addAll(obj);
		obj1.add(12.25);
		System.out.println("Second  List is"+obj1);
		System.out.println("size of list is "+obj1.size());
		System.out.println("checking size is Empty or not "+obj1.isEmpty());
		obj1.remove(1);
		System.out.println("After removing element list:"+obj1);
		System.out.println(obj1.contains(101));
		System.out.println("Element at Index 1:"+obj1.get(1));
		System.out.println("Index of z"+obj1.indexOf('z'));
		System.out.println("Last Index of 12.25 : "+obj1.indexOf(12.25));
		obj.clear();
		System.out.println(obj);
		
		List<Integer> obj3 = new ArrayList<>();
		obj3.add(12);
		obj3.add(13);
		obj3.add(14);
		System.out.println("List 3 is "+obj3);
		//TO sort it in ascending order
		Collections.sort(obj3);
		System.out.println("Updated List 3 is "+obj3);
		Collections.reverse(obj3);
		System.out.println("2nd Updated List 3 is "+obj3);
	}

}
