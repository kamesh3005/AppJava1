package com.demo.day1;

public class LoopDemo1 {

	public static void main(String[] args) {
		int count = 0;
		while (count < 5) {
			System.out.println("Welcome");
			count++;
		}
		System.out.println("--------------");
		count = 6;
		do {
			System.out.println("do..while");
			count++;
		} while (count < 5);

	}

}
