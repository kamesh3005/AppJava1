package com.demo.day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {

		HashMap<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(1003, "Papaya");
		fruitMap.put(1002, "Apple");
		fruitMap.put(1001, "Guava");
		fruitMap.put(1008, "Grapes");
		fruitMap.put(1007, "Banana");
		fruitMap.put(2114, "Mango");
		System.out.println(fruitMap);

		// need key to retrieve value
		// need all keys to retrieve all values

		Set<Integer> keys = fruitMap.keySet();
		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key + "---" + fruitMap.get(key));
		}
		System.out.println("--------------------------");
		for (Integer key : keys) {
			System.out.println(key + "---" + fruitMap.get(key));
		}
		System.out.println("----------------------");
		
		 Set<Entry<Integer, String>>  entries =fruitMap.entrySet();
		 Iterator<Entry<Integer, String>> itr1 =  entries.iterator();
		 while(itr1.hasNext()) {
			 Entry<Integer, String> entry = itr1.next();
			 System.out.println(entry.getKey() +"---" +entry.getValue());
		 }
		 System.out.println("*******************");
		 
		 for (Entry<Integer, String> entry : entries) {
			 System.out.println(entry.getKey() +"---" +entry.getValue());
	
		}

	}

}
