package com.demo.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo2 {

	public static void main(String[] args) {

		Predicate<String> cond1 = str -> str.length() > 6 ? true : false;

		String str1 = "Hello friends";
		String str2 = "Hai";
		System.out.println(cond1.test(str1));
		System.out.println(cond1.test(str2));

		String[] names = { "Dilip", "Dhanush", "Dhivya", "Anusiya", "Kamesh", "Ravi", "Kamesh", "Eniyan", "Bharath" };
		List<String> nameList = Arrays.asList(names);

		nameList.forEach(name -> {
			if (cond1.test(name)) {
				System.out.println(name);
			}
		});
		
		
		Supplier<Double> rand = ()->Math.random();
		
		System.out.println(rand.get());
		
		
		BiFunction<Integer, Integer, Double> sum = (n1,n2)-> n1+n2+1.0;
		
		System.out.println(sum.apply(10, 20));
		
		IntFunction<Integer> square = n->n*n;
		System.out.println(square.apply(6));
		
		
	}

}
