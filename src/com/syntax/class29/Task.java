package com.syntax.class29;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ummar");
		al.add("Madeeha");
		al.add("John");
		al.add("Tom");
		al.add("Trump");
		
		System.out.println("Elemnts of an ArrayList is " + al);
		
		boolean check = al.isEmpty();
		System.out.println(check);
		
		boolean bl = al.contains("Madeeha");
		System.out.println(bl);
		
		System.out.println(al.size());
		
		
		
		
	}

}
