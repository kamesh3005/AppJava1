package com.demo.day3;

import java.util.Scanner;

public class LinkedListDemo1 {
	static Node start = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			showMenu();
			int choice = sc.nextInt();
			if (choice == 4) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("Enter Number");
				int data = sc.nextInt();
				Node newNode = new Node(data);
				addNode(newNode);
				break;
			case 2:
				display(start);
				break;
			case 3:
				System.out.println("Enter Number");
				data = sc.nextInt();
				deleteNode(data);
				break;
			default:
				System.out.println("Invalid Choice");

			}
		}

	}

	private static void deleteNode(int data) {

		boolean isDeleted = false;

		if (start == null) {
			System.out.println("No Node in the List. List is Empty");
		} else if (start.getData() == data) {
			start = start.getNext();
			System.out.println("Node Deleted Successfully");
			isDeleted = true;
		} else {
			Node temp = start;
			Node previous = start;

			while (temp != null) {

				if (temp.getData() == data) {
					previous.setNext(temp.getNext());
					temp.setNext(null);
					isDeleted = true;
					System.out.println("Node Deleted Successfully");
					break;
				}
				previous = temp;
				temp = temp.getNext();
			}
			if (isDeleted == false) {
				System.out.println("Data Not Found");
			}
		}

	}

	private static void addNode(Node newNode) {
		if (start == null) {
			start = newNode;
		} else {
			Node temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
	}

	private static void display(Node temp) {
		System.out.println(temp == null ? "No Node in the List" : "");
		while (temp != null) {
			System.out.print(temp.getData() + "  ---> ");
			temp = temp.getNext();
		}
		System.out.println("\n-----------------");

	}

	private static void showMenu() {

		System.out.println("1. Add Node ");
		System.out.println("2. Display List");
		System.out.println("3. Delete Node");
		System.out.println("4. Exit");
		System.out.println("Enter Your Choice");

	}
}
