package com.syntax.class11;

public class Task {
	public static void main(String[] args) {
		
		String[] cars = { "BMW", "Toyota", "Ferrari", "Ford", "Tesla", "Jeep" };

		for (int j = 0; j < cars.length; j++) {
			System.out.print(cars[j] + ",");
		}
		System.out.println();
		
		System.out.println("===========Task 2===============");
		
		int[] numbers = {10,20,40};
		int total1 = (int) (numbers[0] + numbers[1] + numbers[2]);
		System.out.println("Total is " + total1);
		
		System.out.println("==============another way of sum=============");
		
		// Create an array on integers
				// and calculate the sum of all elements in the array

//				int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };
//				int sum = 0;
//
//				for (int num : numbers) {
//					sum += num;
//				}
//				System.out.println("The sum of all numbers is: " + sum);
//
//				System.out.println("---Using for loop---");
//				int total = 0;
//				for (int i = 0; i < numbers.length; i++) {
//					int num = numbers[i];
//					total += num;
//				}
//				System.out.println("The total of all numbers is: " + total);
//		
		
		
		
	}

}
