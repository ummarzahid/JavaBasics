package com.syntax.class15;

public class Task {
	public static void main(String[] args) {
		
//		String str = "Java is fun";
//		str = str.replace(" ", "");
//		System.out.println(str);
//		
//		System.out.println("=====================");
//		
//		String str1 = "Hello java 1234 @#$%";
//		str1 = str1.replaceAll("[^A-Za-z0-9]" , " ");
//		System.out.println(str1);
//		
//		System.out.println("=====================");
//		
//		String text = "Is it saturday? Is it raining? Do we have a Java Class today?";
//		String[] text1 = text.split("[?]");
//		int length = text1.length;
//		System.out.println(length);
		
		
		//one of the IQ
				String str="ggiugiug 86868 69*()@@!!";
				
				str=str.replaceAll("[^A-Za-z]", "");

				System.out.println(str.length());
				
				String a ="1.Is it saturday 2.Is it raining 3.Do we have a Java Class today?";
				String[] array = a.split("[0-9]");
				
				int sentences = array.length;
				
				System.out.println("Total number of sentences is " + sentences);
				
		

	
		
		
	}

}
