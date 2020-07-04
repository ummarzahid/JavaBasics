package com.syntax.class11;

public class HwClass11 {
	public static void main(String[] args) {

		// Create a 2D array where you will store the following values: Mr, Mrs, Ms,Miss
		//  and Smith, Jordan, Jackson, Obama.
		// After storing values print the following:Mrs Smith, Mr Obama, Ms Jackson,
		// Miss Jordan.

		String[][] names = { {"Mr", "Mrs", "Ms", "Miss"}, 
							 {"Smith", "Jordan", "Jackson", "Obama"} 
		};
		
		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);
		
		System.out.println("\n================================");
		
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has A and B grade
		
		String[][] nameGrade = { {"Smith", "Jordan", "Jackson", "Obama"},
								 {"A", "B", "C", "D"}
				
		};
		System.out.println(nameGrade[0][1] + " has grade " + nameGrade[1][0]);
		System.out.println(nameGrade[0][3] + " has grade " + nameGrade[1][1]);
		
		System.out.println("\n================================");
		
		//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		int[][] oddEven = { {2, 5, 10, 15}, 
							{20, 25, 30, 37}, 
							{40, 41, 46, 51}
				
		};
		for (int row = 0; row < oddEven.length; row++) {
			for (int col = 0; col < oddEven[row].length; col++) {
				if (oddEven[row][col]%2==0 && oddEven[row][col] !=0) {
					System.out.print(oddEven[row][col] + " ");
				}
			}
		}
		
		System.out.println("\n================================");
		
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns. 
		//Print the sum of all numbers.
		
		int[][] num = {   {2, 5, 10,}, 
						  {20, 25, 30,}, 
						  {40, 41, 46,}
	
		};
		int sum = 0;
		for (int row1 = 0; row1 < num.length; row1++) {
			for (int col1 = 0; col1 < num.length; col1++) {
				sum = sum + num[row1][col1];
			}
		}System.out.println("The sum of all numbers is " + sum);
		
		
		System.out.println("\n================================");
		
		//Create a 2D array of integer type with 3 rows and 4 columns 
		//and print all values of the whole array.
		
		int[][] numbers = { {2, 5, 10, 15}, 
							{20, 25, 30, 37}, 
							{40, 41, 46, 51}
				
		};
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + ",");
			}
		} System.out.println();
		

	}

}
