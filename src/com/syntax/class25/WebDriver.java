package com.syntax.class25;

public class WebDriver {

	public void open() {
		System.out.println("Opening browser");
	}

}

class FireFoxDriver extends WebDriver {

	public void open() {
		System.out.println("Opening firefox browser");
	}

}

class ChromeDriver extends WebDriver {
	public void open() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorer extends WebDriver {

	public void open() {
		System.out.println("Opening internet explorer");
	}
}