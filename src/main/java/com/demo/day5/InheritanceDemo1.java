package com.demo.day5;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		BasicCalculator  bc = new BasicCalculator();
		bc.setOperand1(10);
		bc.setOperand2(40);
		int res =bc.add();
		System.out.println(res);
		BasicCalculator.staticMethod();
		ScientificCalculator sc = new ScientificCalculator();
		sc.setOperand1(77);
		sc.setOperand2(88);
		System.out.println(sc.add());
		sc.setOperand3(11);
		System.out.println(sc.multiply());
		sc.staticMethod();
		sc.show();
 
	}

}
