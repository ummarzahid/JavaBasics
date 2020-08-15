package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task {

	/*
	 * Create a map of countries with its capital that will store countries in
	 * alphabetical order. Print all keys and values from a country map using for
	 * each loop and iterator. Print all values from a country map using for each
	 * loop and iterator.
	 */

	public static void main(String[] args) {

		Map<String, String> countries = new TreeMap<>();
		countries.put("USA", "Washington");
		countries.put("Canada", "Ottawa");
		countries.put("Pakistan", "Islamabad");
		countries.put("Australia", "Canberra");

		Set<String> keys = countries.keySet();

		for (String key : keys) {
			System.out.println("The capital of " + key + " is " + countries.get(key));
		}
		
		System.out.println("===============");
		
		Iterator<String> iterator = keys.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(countries.get(key));
		}

	}

}
