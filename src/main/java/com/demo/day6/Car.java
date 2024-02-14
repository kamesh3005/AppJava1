package com.demo.day6;

public class Car implements IVehicle {

	@Override
	public void drive() {
		System.out.println("The Car is in drive Mode");
	}

	@Override
	public void turnLeft() {
		System.out.println("The Car is turning Left");
	}

	@Override
	public void applyBrake() {
		System.out.println("The Car is in Brake Mode");
	}
	
	public void  greetings() {
		System.out.println("Greeting......");
	}

}
