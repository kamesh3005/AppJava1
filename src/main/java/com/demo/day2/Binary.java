package com.demo.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		int[] arr = { 88, 56, 34, 12, 78, 45, 33 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Element");
		int searchElement = sc.nextInt();
		int lower = 0;
		int upper = arr.length - 1;
		int mid = lower + upper / 2;
		boolean found = false;
		while (lower <= upper) {
			System.out.println("Lower = " + lower + " Upper = " + upper + " Mid = " + mid);
			System.out.println("arr[mid] =" + arr[mid]);
			if (arr[mid] == searchElement) {
				System.out.println("Element found at Position " + mid);
				found = true;
				break;
			} else if (arr[mid] < searchElement) {
				lower = mid + 1;
			} else if (arr[mid] > searchElement) {
				upper = mid - 1;
			}
			mid = (upper + lower) / 2;
		}
		if (found == false) {
			System.out.println("Element Not Found");
		}

	}

}
