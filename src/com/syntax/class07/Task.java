package com.syntax.class07;

public class Task {
	public static void main(String[] args) {

//		int i = 1; // odd numbers
//		while (i <= 20) {
//			System.out.println(i);
//			i = i + 2;
//		}
//
//		System.out.println("-----------------------");
//
//		int x = 50;
//		while (x >= 1) {
//			System.out.println(x);
//			x--;
//		}

		// Create a boolean variable workDay and assign true create int variable day and
		// assign it to 1
		// ●As long as it is workDay print “I need a day off” and increase day.
		// ●Once day is 6 print “I do not need a day off any more”

		boolean workDay = true;
		int day = 1;

		while (workDay) {
			System.out.println("I need a day of");
			day++;
			if (day == 6)
				workDay = false;
		}
		System.out.println("I don't need a day off");
		
		System.out.println("---------------------------");

		// how to print odds numbers from 1 to 20
		// 1, 3, 5, 7, 9, 11, 13, 15, 17, 19

		// wrong way, go to jail because of "code redundancy"
//		System.out.println("1");
//		System.out.println("3");
//		System.out.println("5");
//		System.out.println("7");
//		System.out.println("9");

		// 1st way, using mod (%)
		int x = 1;
		while (x < 20) {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		}

		System.out.println("---------------------------");

		// 2nd way, increasing by 2
		int y = 1;
		while (y <= 20) {
			System.out.println(y);
			y += 2;
		}

		System.out.println("---------------------------");

		// 3rd way
		int z = 0;
		while (z < 20) {
			z++;
			System.out.println(z);
			z++;
		}

		System.out.println("---------------------------");

		// 4th way
		int g = 0;
		while (g < 20) {
			System.out.println(++g);
			g++;
		}
		System.out.println("---------------------------");
		
		
		
	}

}
