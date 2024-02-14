package com.demo.day1;

public class LoopDemo4 {

	public static void main(String[] args) {
		int count=1;
		while(true) {
			System.out.println(count);
			if (count >=5) {
				break;
			}
			count++;
		}
		System.out.println("Next stmt");
		System.out.println("-------------------");
		count=0;
		while (count<10) {
			   count++;
			   if (count%2==0) {
				   continue;
			   }
			   System.out.println(count);
			
		}
 
	}

}
