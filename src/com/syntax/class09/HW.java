package com.syntax.class09;

public class HW {
	public static void main(String[] args) {

		for (int a = 1; a <= 4; a++) {
			for (int b = 5; b >= 1; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");

		for (int c = 5; c >= 1; c--) {
			for (int d = 5; d >= 1; d--) {
				System.out.print(c);
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int x = 5; x >= 1; x--) {
			for (int y = 1; y <= x; y++) {
				System.out.print(x);
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int e = 1; e <= 5; e++) {
			for (int f = 1; f <= e; f++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		for (int s = 5; s >= 1; s--) {
			for (int t = 1; t <= s; t++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
