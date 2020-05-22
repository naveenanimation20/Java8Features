package com.naveen.jdk8;

import java.util.function.Function;

public class FunctionInterfaceConcept {

	public static void main(String[] args) {

		/**
		 * Interface Function<T,R> Type Parameters: 
		 * T - the type of the input to
		 * the function R - the type of the result of the function
		 */
		
		Function<String, Integer> func = x -> x.length();
		
		int len = func.apply("This is java 8 and im learning");
		System.out.println(len);
		
		//chaining function:
		
		Function<Integer, Integer> func2 = x -> x * 2;

		int result = func.andThen(func2).apply("This is Naveen here");
		System.out.println(result);

	}

}
