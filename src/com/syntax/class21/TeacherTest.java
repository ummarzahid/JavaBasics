package com.syntax.class21;

public class TeacherTest {

	public static void main(String[] args) {

		ChemTeacher chem = new ChemTeacher();
		chem.name = "James";
		chem.lastName = "Bond";
		chem.yearsOfExp = 20;
		chem.subject = "Chemistry";
		chem.lab = "Experiment";
		chem.info();
		chem.chemInfo();
		
		System.out.println("==================");
		
		MathTeacher math = new MathTeacher();
		math.name = "Tom";
		math.lastName = "Cruise";
		math.yearsOfExp = 25;
		math.subject = "Math";
		math.expert = "expert in fromulas and sloving numbers";
		math.info();
		math.mathInfo();
		
		System.out.println("==================");
		
		PianoTeacher piano = new PianoTeacher();
		piano.name = "Donald";
		piano.lastName = "Trump";
		piano.yearsOfExp = 15;
		piano.subject = "piano";
		piano.isExpert = true;
		piano.info();
		piano.pianoInfo();
		
		

	}

}
