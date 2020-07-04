package com.syntax.class11;

public class RetriveElements {
	public static void main(String[] args) {
//		char[] grades = { 'A', 'B', 'C', 'D', 'F' };
//
//		for (int i = 0; i < grades.length; i++) {
//			System.out.print(grades[i] + ",");
//		}
//		System.out.println();
//
		System.out.println("------Print using advanced/enhanced, for each loop------");
//		for (char grade : grades) {
//			System.out.print(grade + ",");
//		}

		System.out.println("==================================");

		String[] fruits = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };

		for (int j = 0; j < fruits.length; j++) {
			System.out.print(fruits[j] + ",");
		}
		System.out.println();

		System.out.println("=====2nd Way==============");

		for (String fruit : fruits) {
			System.out.print(fruit + ",");
			
			
		}
	}

}
