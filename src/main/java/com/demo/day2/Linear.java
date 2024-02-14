package com.demo.day2;

import java.util.Scanner;

public class Linear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements");
		int n =sc.nextInt();
		int []arr =new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter arr["+i+"]:");
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Enter Search Element");
		int element =sc.nextInt();
		boolean found=false;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]==element) {
				System.out.println("Element found at position " +j);
				found=true;
				break;
			}
		}
 		if (found==false) {
 			System.out.println("Element Not Found");
 		}
 
	}

}
