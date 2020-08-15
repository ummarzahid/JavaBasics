package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HwCities {

	/*
	 * Create a Map from array of cities that will sort keys in alphabetical order.
	 * As a key store the name of the city and as a value store the length of the
	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
	 * is more than 7 characters remove that city .
	 */

	public static void main(String[] args) {
		
		Map<String, Integer> cities = new TreeMap<>();
		cities.put("Moscow", 6);
		cities.put("Paris", 5);
		cities.put("Washington DC", 13);
		cities.put("Los Angeles", 10);
		
		Set<String> keys = cities.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.length() > 7) {
				it.remove();
			}
		}
		System.out.println("Cities less than 7 charachters " + cities);

	}

}
