package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HwEmployee {

	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve an employee who gets the highest salary. Output should be in the
	 * below format John Smith=$100000
	 */

	public static void main(String[] args) {

		Map<String, Integer> emp = new LinkedHashMap<>();
		emp.put("Sumair Jawaid", 150000);
		emp.put("AliJon", 100000);
		emp.put("Asel", 105000);
		emp.put("Sohil", 100000);

		Set<Entry<String, Integer>> entry = emp.entrySet();

		int largest = 0;
		String name = "";

		for (Entry<String, Integer> entry2 : entry) {
			if (entry2.getValue() > largest) {
				largest = entry2.getValue();
				name = entry2.getKey();
			}

		}

		System.out.println(name + "= $" + largest);

	}

}
