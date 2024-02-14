package com.demo.day3;

public class RecursionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
	}
	
	private static  int  fact(int n) {
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*n;
		}
		return fact;
	}
	
	private static  int factorial(int n) {
		if (n==1) {
			return 1;
		}
		return  n*factorial(n-1);
	}

}
