package com.demo.day3;

import java.util.Scanner;

public class QueueDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Queue");
		int size = sc.nextInt();
		MyQueue queue = new MyQueue(size);

		while (true) {
			System.out.println("1.Add (Enqueue)\n2.Delete (Dequeue)\n3.Traversal\n4.Exit");
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			if (choice == 4) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("Enter Data");
				int data = sc.nextInt();
				queue.add(data);
				break;
			case 2:
				queue.delete();
				break;
			case 3:
				queue.display();
				break;
			default:
				System.out.println("Invalid Choice");

			}

		}

	}

}

class MyQueue {
	private int numArr[];
	private int front;
	private int rear;

	public MyQueue() {
		numArr = new int[5];
		rear = front = -1;
	}

	public MyQueue(int size) {
		numArr = new int[size];
		rear=front = -1;
	}

	public void add(int data) {
		if (rear == numArr.length - 1) {
			System.out.println("Queue is Full");
		} else {
			if (rear==-1) {
				   front++;
			}
			rear++;
			numArr[rear] = data;
		}

	}

	public void delete() {
		if (front == -1) {
			System.out.println("Queue is Empty");
		} else {
			int data = numArr[front];
			System.out.println(data);
			for (int i = 0; i < rear; i++) {
				numArr[i]=numArr[i+1];
		   }
			rear--;
			if(rear==-1) {
				front=-1;
			}
		}
	}

	public void display() {
		if (front == -1) {
			System.out.println("Queue is empty");
		} else {
			for (int i =front; i <=rear; i++) {
				System.out.println(numArr[i]);
			}
		}
	}
}
