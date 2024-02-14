package com.demo.day3;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] numArr = { 42, 23, 74, 11, 65, 58, 94, 36, 99, 87 };
		for (int i = 0; i < numArr.length - 1; i++) {
			int small = numArr[i];
			int pos = i;
			for (int j = i + 1; j < numArr.length; j++) {
				if (numArr[j] < small) {
					small = numArr[j];
					pos = j;
				}
			}
			System.out.println(small + " and its position : " + pos);
			int temp = numArr[i];
			numArr[i] = numArr[pos];
			numArr[pos] = temp;
			System.out.println(Arrays.toString(numArr));
		}
		System.out.println("Sorted Array :");
		System.out.println(Arrays.toString(numArr));

	}

}
