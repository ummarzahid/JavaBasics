package com.syntax.class19;

//Create a method that will take a String as a parameter and returns reversed String. 
//Method should be available to all classes within your project and accessible by class name.

public class Task {

	public static String reversed(String a) {
		String reversed = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			reversed += a.charAt(i);
		}
		return reversed;
	}

	// Create a method that will accept an array as parameters and will return a sum
	// of all elements from that array.
	// Method should be visibly only within same package and accessible by the
	// creating an instance of the class.

	protected int arrSum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	// Create a method that will accept a String as a parameter and return a new
	// String that consist only of vowels.
	// Method should be available inside the class where it was declared and
	// executed by calling it is name.
	
	private String vowels(String a) {
		String vowels = a.replaceAll("[^AaEeIiOoUu]", "");
		return vowels;
	}
	
	

	public static void main(String[] args) {
		Task obj = new Task();

		System.out.println(obj.reversed("Ummar"));

		int[] arr = { 5, 5, 10, 5 };
		System.out.println(obj.arrSum(arr));
		
		System.out.println(obj.vowels("Alexandria"));

	}

}
