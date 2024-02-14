package com.demo.day5;

public class BasicCalculator {

	private int operand1;
	private int operand2;

	public BasicCalculator() {
		System.out.println("Construcor -Super class");
	}

	public BasicCalculator(int operand1, int operand2) {
		System.out.println("Construcor -Super class -Parameterized" );
 		this.operand1 = operand1;
		this.operand2 = operand2;
	}

	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public static void staticMethod() {
		System.out.println("It is static method");
	}

	public int add() {
		return operand1 + operand2;
	}
	
	public int sub() {
		
		return operand1-operand2;
	}

	public int divide() {
		return operand1 / operand2;
	}

	public void printMessage() {
		System.out.println("Hai message from super class");
	}

}
