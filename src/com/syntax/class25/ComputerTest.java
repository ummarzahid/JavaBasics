package com.syntax.class25;

public class ComputerTest {
	
	public static void main(String[] args) {
		
		Computer apple = new Apple(1300, "MacBook");
		Computer lenovo = new Lenovo(600, "IdeaPad");
		Computer hp = new HP(500, "Pavilion");
		Computer dell = new Dell(950, "Inspiron 14");
		
		Computer[] brand = {apple, lenovo, hp, dell};
		
		for (int i = 0; i < brand.length; i++) {
			brand[i].display();
			System.out.println("=======");
		}
		
		
		
		
	}

}
