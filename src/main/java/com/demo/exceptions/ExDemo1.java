package com.demo.exceptions;

import java.io.FileInputStream;

public class ExDemo1 {

	public static void main(String[] args) {
		
		FileInputStream  fin ;
		//checked  exception
		//fin = new FileInputStream("sample.txt");
		//unchecked exception
		
		int []arr = new int[5];
		System.out.println(arr[0]);
		//ArrayIndexOutOfBoundsException
		System.out.println(arr[5]);
 
	}

}
