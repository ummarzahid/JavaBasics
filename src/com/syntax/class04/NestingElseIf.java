package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		//if student completed the quiz we'll check the score 
		//if score > 90 --> A, Great Job!
		//if score > 80 --> B, Well Done !
		//if score > 70 --> C, Just passed!
		//otherwise --> F,You failed!
		//if student did not complete the quiz please finish your quiz!
		
		boolean completed = true;
		int score = 90;
		
		if (completed) {
			if (score >= 90) {
				System.out.println("Great Job!");
			}else if (score >= 80) {
				System.out.println("Well Done!");
			}else if (score >= 70) {
				System.out.println("Just Passed!");
			}else {
				System.out.println("You Failed");
			} 
		}else {
			System.out.println("Please finish your quiz");
		}
		
	}

}
