package com.syntax.class26;

//Create a class File that will have the following behaviors: open, edit, close. 
//Edit and close are implemented method while open is an abstract. 
//Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour: 
//Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

public abstract class File {

	public void edit() {
		System.out.println("File can always be edited");
	}

	public void close() {
		System.out.println("File can always be closed");
	}

	public abstract void open();

}

class JavaFile extends File {

	public void open() {
		System.out.println("To open .java file we need notepad++  or sublime text");

	}

}

class WordFile extends File {

	public void open() {
		System.out.println("To open .doc file we need Microsoft word to be installed or any compatiable program");

	}

}

class PdfFile extends File {

	public void open() {
		System.out.println("To open .pdf file we need Adobe Acrobat Reader to installed");

	}
	
	

}
