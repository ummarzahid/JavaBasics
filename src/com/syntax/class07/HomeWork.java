package com.syntax.class07;

public class HomeWork {
	public static void main(String[] args) {
		
		// Print numbers from 1 to 100 in 1 line with space
		int x = 1;
		while (x <= 100) {
			System.out.print(x + " ");
			x++;
		}
		System.out.println("----------------------");

		// Print numbers from 100 to 1

		int y = 100;
		while (y >= 1) {
			System.out.println(y);
			y--;
		}
		System.out.println("----------------------");

		// Print even numbers from 20 to 1 (2 ways)

		// 1st way
		int z = 20;
		while (z >= 1) {
			System.out.println(z);
			z -= 2; // or z = z -2;

		}

		// 2nd way
		int d = 20;
		while (d >= 1) {
			if (d % 2 == 0)
				System.out.println(d);
			d--;
		}
		System.out.println("----------------------");
		
	//	Print odd numbers between 20 and 50 (2 ways)
		// 1st way
		
		int e = 21;
		while (e <= 50) {
			System.out.println(e);
			e += 2; // or e = e -2
		}
		
		//2nd way
		int b = 20;
		while (b < 50) {
			b++;
			System.out.println(b);
			b++;
		}

	}

}
