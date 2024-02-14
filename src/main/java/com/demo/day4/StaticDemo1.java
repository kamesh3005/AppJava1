package com.demo.day4;

public class StaticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		c1.count=100;
		Counter c2 = new Counter();
		c2.count=10;
		System.out.println(c1.count);
		System.out.println(c2.count);
		c1.count++;
		System.out.println(c1.count);
		System.out.println(c2.count);
		System.out.println("----------------------");
		Counter.stCount =780;   //classname.membername
		c1.stCount++;   //only copy of static variable is available
		
		System.out.println(Counter.stCount);
		System.out.println(c1.stCount);
		System.out.println(c2.stCount);
		
		display();

	}
	static void display() {
		
	}

}

class Counter {
	int count;     //instance variable
	static int stCount;   //static variable
	//static method can access only static member
	public static  void staticMethod() {
		stCount++;
		//Cannot make a static reference to the non-static field count
		//count++;
	}
	//can access, both static and nonstatic members
	public void nonStaticMethod() {
		count++;
		stCount++;
		
	}
	
	
}