package com.jdk8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterMap {

	public static void main(String[] args) {

		List<Customer> customersList = Arrays.asList(
				new Customer("Tom", 30), 
				new Customer("Steve", 31),
				new Customer("Peter", 34), 
				new Customer("Simon", 23));
		
		
		String name = customersList.stream()
						.filter(x -> "Peter".equals(x.getName()))
						.map(Customer::getName)
						.findAny()
						.orElse(null);
		
		System.out.println(name);
		System.out.println("-------");
		//print all the names from the list:
		
		List<String> custList = customersList.stream()
						.map(Customer::getName)
						.collect(Collectors.toList());
		custList.forEach(System.out :: println);
		
		
	}

}
