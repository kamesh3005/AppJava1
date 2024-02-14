package com.demo.day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);

		List<Integer> numList2 = Arrays.asList(new Integer[] { 89, 78, 99, 100, 23, 99, 100, 66 });
		// 3rd element
		int element = numList2.get(3);
		System.out.println(element);
		System.out.println("-----------------");
		int len = numList2.size();
		for (int i = 0; i < numList2.size(); i++) {
			System.out.print(numList2.get(i) + "  ");
		}
		System.out.println("\n--------------------------");

		// foreach
		for (Integer num : numList2) {
			System.out.print(num + "  ");
		}
		System.out.println("\n--------------------------");

		Iterator<Integer> it = numList2.iterator();
		while (it.hasNext()) {
			Integer obj = it.next();
			System.out.print(obj + "   ");
		}
		System.out.println("\n--------------------------");

		ListIterator<Integer> lit = numList2.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("********");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

		Collections.sort(numList2);
		System.out.println(numList2);

	}

}
