package com.demo.day9;

public class MyClass implements MyInterface {

	@Override
	public void greetings() {
		System.out.println("Greetings ....");
		MyInterface.printMsg();
	}

}
