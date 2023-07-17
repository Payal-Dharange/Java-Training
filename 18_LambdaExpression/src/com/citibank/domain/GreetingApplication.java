package com.citibank.domain;

public class GreetingApplication {
	private Greetings greetings = null;
	public GreetingApplication() {
		// TODO Auto-generated constructor stub
	}
	public GreetingApplication(Greetings greetings) {
		super();
		this.greetings = greetings;
	}
	
	public void doGreet() {
		greetings.greet();
	}
}
