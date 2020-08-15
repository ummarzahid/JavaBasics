package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();
		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black and white"));

		System.out.println("1.        ----          Using EntrySet        ---              ");
		Set<Entry<Integer, Animal>> entries = life.entrySet();

		System.out.println("============ Access all variables and call all available methods of Animals ============");
		for (Entry<Integer, Animal> e : entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");

		}

		System.out.println("    ----    EntrySet write with Iterator     ----    ");
		Iterator<Entry<Integer, Animal>> iterator = entries.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Animal> ent = iterator.next();
			Animal value = ent.getValue();
			System.out.println(value.type);
			System.out.println(value.color);
			value.eat();		
			value.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("2.        ----          Using values()        ---              ");

		Collection<Animal> values = life.values();
		for (Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");

		}
		System.out.println("    ----    values() write with Iterator     ----    ");
		Iterator<Animal> iterator1 = values.iterator();
		while (iterator1.hasNext()) {
			Animal value = iterator1.next();
			System.out.println(value.type);
			System.out.println(value.color);
			value.eat();
			value.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("3.        ----          Using keySet()        ---              ");

		Set<Integer> keys = life.keySet();

		for (int key : keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
		}

		System.out.println("    ----    keySet() write with Iterator     ----    ");
		Iterator<Integer> iterator2 = keys.iterator();
		while (iterator2.hasNext()) {
			Integer value1 = iterator2.next();
			Animal animal = life.get(value1);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("  ----------   ");
			
			

		}

	}

}
