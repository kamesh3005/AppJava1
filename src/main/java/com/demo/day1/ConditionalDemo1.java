package com.demo.day1;

public class ConditionalDemo1 {

	public static void main(String[] args) {
		int choice = 3;
		// Cannot switch on a value of type boolean. Only convertible int values,
		// strings or enum variables are permitted
		// Cannot switch on a value of type float,double
		boolean res = true;

//		if (choice == 1) {
//			System.out.println("One");
//		} else if (choice == 2) {
//			System.out.println("Two");
//		} else if (choice == 3) {
//			System.out.println("Three");
//		} else {
//			System.out.println("INvalid Choice");
//		}
//		choice = 1;
//		switch (choice) {
//		case 1:
//			System.out.println("One");
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//		default:
//			System.out.println("Invalid Choice");
//		}

//		choice = 1;
//		switch (choice) {
//		case 1:
//			System.out.println("One");
//			break;
//		case 2:
//			System.out.println("Two");
//			break;
//		case 3:
//			System.out.println("Three");
//			break;
//		default:
//			System.out.println("Invalid Choice");
//		}

		choice = 7;
		switch (choice) {
		case 1:
			System.out.println("One");
			break;
		case 2:	
			System.out.println("Two");
			break;
			default:
				System.out.println("Invalid Choice");
				break;

		case 3:
			System.out.println("Three");
		}

	}

}
