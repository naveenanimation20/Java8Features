package com.naveen.jdk8;

@FunctionalInterface
public interface Page {
	
	public void greet();//only one abstract method

	public static void test(){
		
	}
	
	default void display(){
		
	}

}
