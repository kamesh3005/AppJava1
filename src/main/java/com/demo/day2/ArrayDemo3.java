package com.demo.day2;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] arr = { 88, 34, 56, 12, 33, 76, 37, 55 };
		String str = Arrays.toString(arr);
		System.out.println(str);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println("\n---------------");
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}

	}

}
