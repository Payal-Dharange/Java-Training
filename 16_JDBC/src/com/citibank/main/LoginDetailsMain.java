package com.citibank.main;

import java.util.Scanner;

import com.citibank.repository.LoginRepository;

public class LoginDetailsMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LoginRepository loginRepository = new LoginRepository();
		String userId;
		String password;
		String result, continuechoice = null;
		int counter;
		
		do {
			System.out.println("Enter User ID");
			userId = scanner.next();
			System.out.println("Enter User Passowrd");
			password = scanner.next();
			result = loginRepository.getSingleEmployee(userId, password);
			if (result != null) {		
				System.out.println("Welcome " +  result);
				continuechoice = "no";
			} 
			else {
				System.out.println("Invalid userID and password");
				counter = loginRepository.getRepeatCount();
				System.out.println(counter);
				if(counter <= 3) {
					System.out.println("do you want to try again");
					continuechoice = scanner.next();
				}else {
					System.out.println("Your ID has been locked");
					continuechoice = "no";
				}
			}
		}while(continuechoice.equalsIgnoreCase("yes"));		
		
	}
}
