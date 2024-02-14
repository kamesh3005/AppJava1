package com.demo.day6;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		Car  car = new Car();
		car.drive();
		car.turnLeft();
		car.applyBrake();
		car.greetings();
		//Car implements  IVehicle
		System.out.println("-------------------------");
		IVehicle  iv= new  Car();
		iv.drive();
		iv.turnLeft();
		iv.applyBrake();
	   //iv.greetings() -- not possible, because iv is of type IVehicle
		
		//Circle implements  IShape
		IShape  is = new  Circle(10);
		//Type mismatch: cannot convert from Car to IShape
		//because Car class doesn't implement the interface IShape
		//IShape  is1 = new Car();
		
		
 
	}

}
