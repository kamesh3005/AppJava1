package com.demo.day5;

public class Circle  extends Shape{
	
	private double radius;
	
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
 		return  Math.PI*radius*radius;
	}

	@Override
	public double calculateCirumference() {
 		return 2*Math.PI*radius;
	}

}
