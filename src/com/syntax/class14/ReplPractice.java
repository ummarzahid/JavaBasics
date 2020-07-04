package com.syntax.class14;

import java.util.Scanner;

public class ReplPractice {
	public static void main(String[] args) {
		
//		String name = "Timmy";
//		int size = name.length();
//		System.out.println(size);
//		
//		System.out.println("===================");
//		
//		String s1 = "Hello";
//	    boolean isEmpty = s1.isEmpty();
//	    
//	    String s2 = "";
//	    boolean isEmpty1 = s2.isEmpty();
//	    
//	    System.out.println(isEmpty);
//	    System.out.println(isEmpty1);
//	    
//	    System.out.println("====================");
//	    
//	    String str1 = "syntax technologies";
//	    String str2 = "SYNTAX TECHNOLOGIES";
//	    
//	    System.out.println(str1.toUpperCase());
//	    System.out.println(str2.toLowerCase());
	    
//	    System.out.println("====================");
//	    
//	    String s1="hello how are you";
//	    System.out.println(s1.endsWith("u"));
//	    System.out.println(s1.endsWith("world"));
//	    System.out.println(s1.endsWith("are"));
//	    System.out.println(s1.endsWith("you"));
//	    
//	    System.out.println("====================");
	    
//	    String str = "abracadabra alakazam";
//	    String target1 = "dab";
//	    String target2 = "ABRA";
//	    
//	    System.out.println( str.indexOf("c"));
//	    System.out.println(str.indexOf(" "));
//	    System.out.println(str.indexOf(target1));
//	    System.out.println(str.indexOf(target2));
//	    
//	    System.out.println("====================");
//	    
//		String given = "I love Java classes at Syntax";
//		String substr=given.substring(12);
//		System.out.println(substr);
//		
//		substr=given.substring(0, 11);
//		System.out.println(substr);
	    
//	    System.out.println("====================");
//	    
//	    Scanner scan = new Scanner(System.in);
//	    
//	    String value = scan.nextLine();
//	    String substr = value.substring(0, 3);
//	    System.out.println("The first 3 letters of " + value + " is " + substr);
	    
//	    System.out.println("====================");
//	    
//	    StringBuffer sb = new StringBuffer(); 
//		sb.append("Hello");
//		sb.append(" ");
//		sb.append("World");
//		
//		String upper = sb.toString().toUpperCase();
//		
//		System.out.println(upper);
		
		System.out.println("====================");
		
		String givenString = "Hello Friends";

		StringBuffer sb = new StringBuffer(givenString);
		sb.reverse();
	
		String reversedString=sb.toString();
		
		System.out.println(reversedString);	
	    
	    
	    
	    
	    
	    
		
	}
	
	

}
