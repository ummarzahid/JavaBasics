package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */

	public static void main(String[] args) {

		Set<String> countries = new TreeSet<>(); // use to retrieve elements in order
		countries.add("America");
		countries.add("Pakistan");
		countries.add("Canada");
		countries.add("Australia");
		countries.add("England");

		System.out.println("====== Retriving ussing For each loop ======");

		System.out.println(countries.size());
		for (String country : countries) {
			System.out.println(country);
		}

		System.out.println("====== Retriving using Iterator ======");

		Iterator<String> iterator = countries.iterator();
		while (iterator.hasNext()) {
			String it = iterator.next();
			System.out.println(it);
		}

		System.out.println("===== Task 2 =====");
		/*
		 * Create a Set of cities in which you want to make sure that insertion order is
		 * maintained. Using Iterator remove any city that starts with “A”;
		 */

		Set<String> cities = new LinkedHashSet<>(); // use to retrieve elements in insertion order

		cities.add("Alexandria");
		cities.add("Woodbridge");
		cities.add("Arlington");
		cities.add("Sterling");

		Iterator<String> list = cities.iterator();
		while (list.hasNext()) {
			String lis = list.next();
			if (lis.startsWith("A")) {
				list.remove();

			}

		}
		System.out.println(cities);

	}

}
