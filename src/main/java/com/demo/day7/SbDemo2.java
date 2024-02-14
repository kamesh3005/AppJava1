package com.demo.day7;

public class SbDemo2 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Hello Friends, This is sample");
		System.out.println(sb1);
		sb1.deleteCharAt(3);
		System.out.println(sb1);
		//start,end
		//start from 3rd position 9th position (end index  - exclude)
		sb1.delete(3, 10);
		System.out.println(sb1);
		
		
    sb1.reverse();
    System.out.println(sb1);
    String res =sb1.toString();
    System.out.println(res);
    
    StringBuffer  sb2 = new StringBuffer("This is sample");
    
//		sb2.replace(2, 4, "*******");
//		System.out.println(sb2);
	int pos=	  sb2.indexOf("is"); //2
	int len ="is".length();  // 2
	sb2.replace(pos, pos+"is".length(), "*********");
	System.out.println(sb2);
		
 
	}

}
