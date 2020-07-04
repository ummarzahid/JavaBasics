package com.syntax.class10;

import java.util.Scanner;

public class Recap { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many floors you have?");
		int floor = scan.nextInt();
		System.out.println("How rooms you have in each floor?");
		int rooms = scan.nextInt();
		
		for (int i = 1; i <= floor; i++) {
			System.out.println("We are in the floor " + i + " ---> ");
						
			for (int j = 1; j <= rooms; j++) {
				System.out.print(i + "." + j + " ");
			}
			System.out.println();
			
		}
			
		
		
	}

}
