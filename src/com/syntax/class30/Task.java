package com.syntax.class30;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
		/*Create an arraylist of cars and retrieve all the values using 
		 * 3 different ways.
		 *Create an arrayList of words. Remove every word that 
		 *ends with “e”. 
		 */
			ArrayList<String> car = new ArrayList<>();
			car.add("Toyota");
			car.add("Honda");
			car.add("Benz");
			car.add("Audi");
			car.add("Lexus");
			car.add("Jeep");
			
			System.out.println(car);
			
			for(String c:car) {
				System.out.print(c+" ");
			}
			System.out.println();
			
			for (int i=0; i<car.size(); i++) {
				String myList= car.get(i);
				System.out.print(myList+" ");
			}
			System.out.println();
		
	}

}
