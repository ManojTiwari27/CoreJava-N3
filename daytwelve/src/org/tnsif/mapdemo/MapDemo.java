package org.tnsif.mapdemo;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//HashMap is ordered and Linked hashmap is Unordered
public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> obj = new HashMap<>();
		obj.put(411001, "Mg Road");
		obj.put(422001, "Mg Road");
		System.out.println(obj);
		
		Map<Integer,String> obj1 = new LinkedHashMap<>();
		obj1.put(411001, "Mg Road");
		obj1.put(422001, "Mg Road");
		System.out.println(obj);

	}

}
