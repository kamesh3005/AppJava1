package com.demo.day5;

public abstract class Shape {
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calculateArea();

	public abstract double calculateCirumference();

	public void greetings() {

		System.out.println("Greetings ........");
	}

}
