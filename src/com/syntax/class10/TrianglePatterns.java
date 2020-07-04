package com.syntax.class10;

public class TrianglePatterns {
	public static void main(String[] args) {

		for (int e = 1; e <= 5; e++) {
			for (int f = 1; f <= e; f++) {
				System.out.print(e);
			}
			System.out.println();
		}
		System.out.println("=================================");

		for (int s = 5; s >= 1; s--) {
			for (int t = 1; t <= s; t++) {
				System.out.print(s);
			}
			System.out.println();
		}
		System.out.println("=================================");

		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b >= a; b--) {
				System.out.print(b);
			}
			System.out.println();
		}
		System.out.println("=================================");

		for (int row = 1; row <= 4; row++) {
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}

		for (int i = 5; i > 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
