package com.syntax.class32;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {

	public static void main(String[] args) {

		Map<Integer, Person> details = new TreeMap<>();
		details.put(1, new Person("Sumair", "Jawaid", 35, 125000));

		Set<Entry<Integer, Person>> entries = details.entrySet();

		for (Entry<Integer, Person> entry : entries) {
			Integer key = entry.getKey();
			Person value = entry.getValue();

			System.out.print(key + ": ");
			value.userDetails();

		}

	}

}
