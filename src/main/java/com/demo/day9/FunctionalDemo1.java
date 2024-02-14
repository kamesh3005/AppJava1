package com.demo.day9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class FunctionalDemo1 {

	public static void main(String[] args) {

		MyInterface fun1 = () -> System.out.println("Have a Great Day.......");

		fun1.greetings();

		Consumer<Integer> square = n -> {
			int s = n * n;
			System.out.println("square  :" + s);
		};

		square.accept(5);

		BiConsumer<Integer, Double> add = (n1, n2) -> System.out.println(n1 + n2);

		add.accept(1, 77.8123);

		IntConsumer mySquare = n -> System.out.println(n * n);
		mySquare.accept(88);
		String[] names = { "Dilip", "Dhanush", "Dhivya", "Anusiya", "Kamesh", "Ravi", "Kamesh", "Eniyan", "Bharath" };
		List<String> nameList = Arrays.asList(names);
		nameList.forEach(name -> System.out.println(name));
		System.out.println("---------------------");
		nameList.forEach(name -> {
			if (name.contains("e")) {
				System.out.println(name);
			}
		});

	}

}
