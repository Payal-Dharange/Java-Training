package com.citibank.main;

import com.citibank.domain.GoodAfternoonGreetings;
import com.citibank.domain.GoodMorningGreetings;
import com.citibank.domain.GreetingApplication;
import com.citibank.domain.Greetings;

public class GreetingApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodMorningGreetings goodMorningGreetings = new GoodMorningGreetings();
		GoodAfternoonGreetings goodAfternoonGreetings = new GoodAfternoonGreetings();
		GreetingApplication greetingApplication = new GreetingApplication(goodAfternoonGreetings);
		greetingApplication.doGreet();
		GreetingApplication greetingApplication2 = new GreetingApplication(goodMorningGreetings);
		greetingApplication2.doGreet();
		Greetings goodEveningGreetings = () -> System.out.println("Good Evening !!");
		GreetingApplication greetingApplication3 = new GreetingApplication(goodEveningGreetings);
		greetingApplication3.doGreet();
		
	}

}
