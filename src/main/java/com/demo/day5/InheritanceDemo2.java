package com.demo.day5;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("--------------");
		B b = new B();
		System.out.println("------------------");
		BasicCalculator bc = new BasicCalculator(10, 20);
		bc.printMessage(); // super class method

		ScientificCalculator sc = new ScientificCalculator(100, 200, 300);
		sc.printMessage(); // subclass method

		
		//Runtime Polymor[hism
		// relationship - IS-A
		// superclass reference variable holds the reference of subclass object
		BasicCalculator calc = new ScientificCalculator();
		calc.setOperand1(10);
		calc.setOperand2(5);
		// methods of super class alone accessible
		// divide is method of BasicCalculator
		System.out.println(calc.divide());
		System.out.println(calc.sub());
		
		// printMessage,add - overrided method - for the overrided method - method invocation
		//will be decided during the runtime - ie  object is of type subclass, ref var type -super class
		//so during run time  method invocation is decided, object is of type subclass
		//so subclass method will be invoked
		calc.printMessage();
		System.out.println(calc.add());

	}

}

class A {
	public A() {
		System.out.println("Constructor -A");
	}
}

class B extends A {
	public B() {
		System.out.println("Constructor -B");
	}
}

class C extends B {
	public C() {
		System.out.println("Constructor -C");
	}
}