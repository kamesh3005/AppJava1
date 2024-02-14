package com.demo.day3;

import java.util.Scanner;

public class StackDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		int size = sc.nextInt();
		MyStack stack = new MyStack(size);

		while (true) {
			System.out.println("1.Push\n2.Pop\n3.Traversal\n4.Exit");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			if (choice == 4) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("Enter Data");
				int data = sc.nextInt();
				stack.push(data);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			default:
				System.out.println("Invalid Choice");

			}

		}

	}

}

class MyStack {
	private int numArr[];
	private int top;

	public MyStack() {
		numArr = new int[5];
		top = -1;
	}

	
	public MyStack(int size) {
		numArr = new int[size];
		top = -1;
	}

	public void push(int data) {
		if (top == numArr.length - 1) {
			System.out.println("Stack is Full");
		} else {
			top++;
			numArr[top] = data;
		}

	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
		} else {
			int data = numArr[top];
			System.out.println(data);
			top--;
		}
	}
	
	public void display() {
		if (top==-1) {
			System.out.println("Stack is empty");
		}
		else {
			for(int i =top;i>=0;i--) {
				System.out.println(numArr[i]);
			}
		}
	}
}
