package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//let's create an ArrayList that will store numbers
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(100); //0
		aList.add(200);//1
		aList.add(300);//2
		//aList.add("400"); // we cannot store String into ArrayList of Integer objects 
		
		System.out.println("Size of aList " + aList.size());
		System.out.println(aList);
		
		aList.add(1);//3
		aList.add(2);//4
		aList.add(2);
		aList.add(2);
		aList.add(2);
		
		System.out.println(aList);
		
		aList.remove(3); // specifying index of element to remove 
		System.out.println(aList);
	
		
	}

}
