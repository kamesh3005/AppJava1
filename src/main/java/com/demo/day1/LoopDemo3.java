package com.demo.day1;

public class LoopDemo3 {

	public static void main(String[] args) {

		for (int i = 1, j = 20; i <= 10; i++, j--) {
			System.out.println(i + "-" + j);
		}
		System.out.println("-----------------");
		int i, j;
		for (i = 1, j = 20; i <= 5; i++, j--) {
			System.out.println(i + "-" + j);
		}
		System.out.println("-----------------");
		int k = 5;
		// Duplicate local variable k
		// Inside the for loop - redeclaration of k
		// for(int m=1,k=10;m<=5;m++,k--) {
		// System.out.println(m + "-" + k);
	}

}
