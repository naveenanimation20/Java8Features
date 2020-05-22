package com.naveen.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpAndMethodReferences {

	public static void main(String[] args) {

		List<String> namesList = Arrays.asList("Tom", "Peter", "Naveen", "Simon");

		// for loop:
		for (int i = 0; i < namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}

		System.out.println("-----");

		for (String t : namesList) {
			System.out.println(t);
		}

		System.out.println("-----");

		// 1. With Anonymous class :
		namesList.forEach(new Consumer<String>() { // Anonymous class

			@Override
			public void accept(String t) {
				System.out.println(t);

			}

		});

		System.out.println("-----");

		// 2. Lambda Exp: ->
		namesList.forEach(str -> System.out.println(str));

		System.out.println("-----");

		// 3. Method References :
		namesList.forEach(System.out::println);

	}

}
