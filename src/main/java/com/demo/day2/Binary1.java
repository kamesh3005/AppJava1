package com.demo.day2;

import java.util.Arrays;

public class Binary1 {

	public static void main(String[] args) {
		int []arr = {88,56,34,12,78,45,33};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int pos =Arrays.binarySearch(arr, 34);
		System.out.println(pos);
		System.out.println(Arrays.binarySearch(arr, 78));
		
		System.out.println(Arrays.binarySearch(arr, 88));
		System.out.println(Arrays.binarySearch(arr, 12));
		System.out.println(Arrays.binarySearch(arr, 75));
		System.out.println(Arrays.binarySearch(arr, 11));

	}

}
