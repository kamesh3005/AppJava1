package com.demo.day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		String[] names = { "Dilip", "Dhanush", "Dhivya", "Anusiya", "Kamesh", "Ravi", "Kamesh", "Eniyan", "Bharath" };
		List<String> nameList = Arrays.asList(names);
		System.out.println(nameList);
		Set<String> nameSet = new  HashSet<String>(nameList);
		System.out.println(nameSet);
			
		TreeSet<Integer> numSet = new  TreeSet<Integer>();
		numSet.add(789);
		numSet.add(189);
		numSet.add(675);
		numSet.add(88);
		numSet.add(378);
		System.out.println(numSet);
		
		TreeSet<String> nameSet1 = new TreeSet<String>(nameList);
		System.out.println(nameSet1);
	
		TreeSet<String> nameSet2 = new TreeSet<String>(nameSet);
		System.out.println(nameSet2);
	}

}
