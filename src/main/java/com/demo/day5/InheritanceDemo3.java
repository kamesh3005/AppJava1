package com.demo.day5;

public class InheritanceDemo3 {

	public static void main(String[] args) {
		//Cannot instantiate the type Shape
		//Shape sh = new Shape();
  
		Circle c1 = new Circle("red", 25);
		System.out.println(c1.calculateArea());
		System.out.println(c1.calculateCirumference());
		c1.greetings();
		System.out.println(c1.getColor() +"   " +c1.getRadius());
		
		Square s1 = new Square("green", 10);
		System.out.println(s1.calculateArea());
		System.out.println(s1.calculateCirumference());
		c1.greetings();
		System.out.println(s1.getColor() +"   " 
				+s1.getSide());
	}

}
