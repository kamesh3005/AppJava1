package com.demo.day3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numArr = { 42, 23, 74, 11, 65, 58, 94, 36, 99, 87 };
		
		for(int j=1;j<numArr.length;j++) {
		for (int i = 0;i<numArr.length-j; i++) {
			if (numArr[i] > numArr[i + 1]) {
				int temp =numArr[i];
				numArr[i]=numArr[i+1];
				numArr[i+1]=temp;
			}
//			System.out.println(Arrays.toString(numArr));
		}
		System.out.println("Iteration : " +j);
		System.out.println(Arrays.toString(numArr));

		}
		
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(numArr));
	}
}
