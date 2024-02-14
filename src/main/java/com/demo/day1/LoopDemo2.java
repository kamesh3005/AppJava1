package com.demo.day1;

public class LoopDemo2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int sum = 100;
		}
		{
			int j = 100;
		}
		// i and j,sum are declared in side the block - the scope and visibility of the
		// variable is inside the block only
		// System.out.println(i);
		// System.out.println(j);
		// System.out.println(sum);
		// block level variable

		int count;
		for (count = 10; count <= 15; count++) {
			System.out.println(count);
		}
		System.out.println(count);

		int cnt = 1;
		for (; cnt <= 5; cnt++) {
			System.out.println(cnt);
		}
		System.out.println("---------------");
		for (int i = 1; i <= 5;) {
			System.out.println(i++);
		}
		System.out.println("-----------------");
		int  val=1;
		for(;val<=5;) {
			System.out.println(val++);
		}
		System.out.println("---------------");
		for(int n=1;n<=5;System.out.println(n++));
		System.out.println("---------------");
		//block level variable n - can't refer outside the for
		//for(int n=1;n<=5;n++);{
		//System.out.println(n);
		//}
		int  counter=1;
		for(counter=10;counter<=14;counter++);{
			System.out.println(counter);
		}

		
		
		
	}

}
