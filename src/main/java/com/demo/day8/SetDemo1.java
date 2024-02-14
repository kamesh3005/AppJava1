package com.demo.day8;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo1 {

	public static void main(String[] args) {
	HashSet<String> fruitSet = new HashSet<String>();
	fruitSet.add("Papaya");
	fruitSet.add("Banana");
	fruitSet.add("Guava");
	fruitSet.add("Grapes");
	System.out.println(fruitSet);
	
	fruitSet.add("Papaya");
	System.out.println(fruitSet);
	
	for (String name : fruitSet) {
		System.out.println(name);
		
	}
	System.out.println("--------------");

	 Iterator<String> it = fruitSet.iterator();
	 while(it.hasNext()) {
		 String name =it.next();
		 System.out.println(name);
	 }
   ;

 
	}

}
