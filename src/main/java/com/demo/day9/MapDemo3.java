package com.demo.day9;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo3 {

	public static void main(String[] args) {

		TreeMap<Integer, String> fruitMap = new TreeMap<Integer, String>();
		fruitMap.put(1003, "Papaya");
		fruitMap.put(1002, "Apple");
		fruitMap.put(1001, "Guava");
		fruitMap.put(1008, "Grapes");
		fruitMap.put(1007, "Banana");
		fruitMap.put(2114, "Mango");
		System.out.println(fruitMap);

		 
		
		 Set<Entry<Integer, String>>  entries =fruitMap.entrySet();
		 for (Entry<Integer, String> entry : entries) {
			 System.out.println(entry.getKey() +"---" +entry.getValue());
	
		}
		 System.out.println("------------------------");
		  NavigableMap<Integer, String> map1=  fruitMap.descendingMap();
		  System.out.println(map1);

	}

}
