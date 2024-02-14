package com.demo.day9;

import java.util.HashMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> fruitMap = new HashMap<Integer, String>();
		fruitMap.put(1003,"Papaya");
		fruitMap.put(1002,"Apple");
		fruitMap.put(1001,"Guava");
		fruitMap.put(1008,"Grapes");
		fruitMap.put(1007,"Banana");
		fruitMap.put(2114,"Mango");
		System.out.println(fruitMap);
		
		fruitMap.put(1002,"*****");
		System.out.println(fruitMap);
		
		String  fruit1= fruitMap.get(1008);
		System.out.println(fruit1);
		
		String  fruit2= fruitMap.get(1456);
		System.out.println(fruit2);
		
		 boolean  res=  fruitMap.containsKey(2114);
		 if (res) {
			 System.out.println(fruitMap.get(2114));
		 }
		 else {
			 System.out.println("Invalid Key ");
		 }


		 System.out.println("Contains  'Mango' : "+fruitMap.containsValue("Banana"));
		 System.out.println("Contains  'Jackfruit' : "+fruitMap.containsValue("Jackfruit"));

		 
		 fruitMap.remove(1008);
		 System.out.println(fruitMap);
		 
	}

}
