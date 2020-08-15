package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedList;

public class HwDuplicatesInt {

	/*
	 * Create a collection of integers in which you can keep duplicates. Write a
	 * logic to find sum of all integers
	 */
	
	public static void main(String[] args) {
		
		Collection<Integer> numbers = new LinkedList<>();
		numbers.add(50);
		numbers.add(100);
		numbers.add(150);
		numbers.add(100);
		numbers.add(200);
		
		int sum = 0;
		for (Integer num : numbers) {
			sum += num;
		}
		
		System.out.println(sum);
		
	}

}
