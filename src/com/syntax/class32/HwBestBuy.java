package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HwBestBuy {

	/*
	 * Create a map of Best Buy store. Place item id and item name into it. Example
	 * (7664847 = Printer, 7879885= TV etc )
	 * 
	 * Retrieve all keys and values from a Best Buy map using EntrySet.
	 */

	public static void main(String[] args) {

		Map<Integer, String> bestBuy = new LinkedHashMap<>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(7664837, "Laptop");
		bestBuy.put(7584847, "Play Station");
		
		Set<Entry<Integer, String>> items = bestBuy.entrySet();
		for (Entry<Integer, String> entry : items) {
			String keyValue = entry.getKey() + ": " + entry.getValue();
			System.out.println(keyValue);
			
		}

	}

}
