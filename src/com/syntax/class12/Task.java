package com.syntax.class12;

public class Task {
	public static void main(String[] args) {

		String[][] food = {

				{ "Sushi", "Burger", "Pizza", "Pasta" }, { "Biryani", "Wings", "Steak" } };

		for (int row = 0; row < food.length; row++) {
			for (int col = 0; col < food[row].length; col++) {
				String f = food[row][col];
				System.out.print(f + " ");
			}
			System.out.println();
		}

		System.out.println("---------using enhanced----------");

		for (String[] a : food) {
			for (String b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

		System.out.println("================================");

		int[][] num = { { 2, 5, 10, }, 
						{ 20, 15, 30, }, 
						{ 40, 41, 46, }

		};
		
		int sum = 0;
		for (int row1 = 0; row1 < num.length; row1++) {
			for (int col1 = 0; col1 < num.length; col1++) {
				
				if(num[row1][col1]%2!=0) {
					sum = sum + num[row1][col1];
				}	
				
			}
			
		}
		System.out.println("The sum of odd numbers is " + sum);

	}
}
