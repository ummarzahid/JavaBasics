package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork {

	/*
	 * Create a map of a building. Store floor number and it is associated company
	 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
	 * keys and values. Check how many entries you have? Update company on a 4th
	 * floor Remove company on the 7th floor Print your map
	 */

	public static void main(String[] args) {

		Map<Integer, String> buildings = new LinkedHashMap<>();
		buildings.put(1, "Google");
		buildings.put(2, "Netflix");
		buildings.put(3, "LinkedIn");
		buildings.put(4, "Syntax");
		buildings.put(5, "Amzaon");
		buildings.put(6, "Netflix");
		buildings.put(7, "Facebook");

		System.out.println(buildings);

		System.out.println("Number of entries " + buildings.size());

		buildings.put(4, "Dell");
		System.out.println("After updating company on 4th floor " + buildings);

		buildings.remove(7);
		System.out.println("After deleting companu on 7th floor " + buildings);

		Set<Integer> pairValues = buildings.keySet();

		Iterator<Integer> keyIt = pairValues.iterator();
		while(keyIt.hasNext()) {
			keyIt.next();
		}
		
		for (Integer key : pairValues) {
			System.out.println(key + " ===> " + buildings.get(key));
		}

	}

}
