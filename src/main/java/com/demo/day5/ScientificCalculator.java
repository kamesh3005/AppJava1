package com.demo.day5;

public class ScientificCalculator extends BasicCalculator {
	 private int operand3;
	 //redeclare the  superclass instance variable in the subclass
	//private int operand1; //hiding of the field ,  not recommended
	 
	 public ScientificCalculator() {
		 System.out.println("Default Constructor -subclss");
  	}
	 public ScientificCalculator(int operand1, int operand2, int operand3) {
		 
			super(operand1, operand2);
			this.operand3 = operand3;
			System.out.println("Construcor from sub class -Parameterized");

		}
	 
	 public int getOperand3() {
		return operand3;
	}
	
	public void setOperand3(int operand3) {
		this.operand3 = operand3;
	}
	 
	 public  int  multiply() {
		 return  getOperand1()*getOperand2()*operand3;
	 }
	 //hiding of method - not recommended
	// public static void staticMethod() {
	//		System.out.println("It is static method - subclass");
	//	}
	 
	 @Override
	 public int add() {
		 System.out.println("add method -subclass");
		 return  getOperand1()+getOperand2()+operand3;

	 }
	 public void show() {
		 printMessage();     // --> current class - sub class
		 super.printMessage();  // --> super class
	 }
	 //Cannot reduce the visibility of the inherited method from BasicCalculator
	 public void printMessage() {
		 System.out.println("Message from sub class");
	 
	 }
	 
	 
	 

}
