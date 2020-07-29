package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to the arraylist 
		arrayList.add("Hello");
		arrayList.add("Welcome");
		arrayList.add("How are you");
		
		//how manu elements inside my ArrayList
		int arrayListSize = arrayList.size();
		System.out.println("Size of original arrayList " + arrayListSize);
		
		
		// how to access elements from the ArrayList 
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		//Iwould like to add more objects to my ArrayList
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		System.out.println("Size of ArrayList after adding more String objects = " + arrayList.size());
		System.out.println("------- ArrayList after adding more String objects" + arrayList);
		
		// let's remove "Hello"
		arrayList.remove(0);
		System.out.println("Size of ArrayList after removing  objects = " + arrayList.size());
		System.out.println("------- ArrayList after removing  objects" + arrayList);
		
		//I want to update value "Good Bye" ---> "Bye"
		arrayList.set(2, "Bye");
		System.out.println("------- ArrayList after replacing object " + arrayList);
	}

}
