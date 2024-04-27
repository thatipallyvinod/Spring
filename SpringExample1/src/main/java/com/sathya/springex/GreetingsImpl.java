package com.sathya.springex;

public class GreetingsImpl implements Greetings{

	@Override
	public void greet() {
		System.out.println("This is a Spring First Example");
		System.out.println("Hello World");
		
	}
	
	public GreetingsImpl () {
		System.out.println("Spring Bean Created Success");
	}

}