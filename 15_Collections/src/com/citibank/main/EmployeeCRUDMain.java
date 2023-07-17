package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;
import com.citibank.repository.EmployeeRepository;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		EmployeeRepository employeeRepository = new EmployeeRepository();
		Employee employee = null;
		boolean result;
		int choice;
		int employeeId;
		String name, continuechoice;
		double salary;
		do {	
			System.out.println("Menu");
			System.out.println("1. Add New Employee");
			System.out.println("2. Update Salary of Existing Employee");
			System.out.println("3. Dispaly Single Employee Details");
			System.out.println("4. Dispaly All Employee");
			System.out.println("5. Delete Single Employee");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println(" Enter Employee ID");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println(" Enter Employee Name");
				name = scanner.nextLine();
				System.out.println(" Enter Employee Salary");
				salary = scanner.nextDouble();
				employee = new Employee(employeeId, name , salary);
//				System.out.println("Enter number of employees");
//				int number = scanner.nextInt();
//				for (int i = 1; i > number; i++) 
//					employee = new Employee((100+i),("Payal"+i) ,(i+000));
//				employee = new Employee(101,"Payal",1000);
//				result = employeeRepository.addNewEmployee(employee);
//				employee = new Employee(102,"Varsha", 2000);
//				result = employeeRepository.addNewEmployee(employee);
//				employee = new Employee(103,"Prachi", 3000);
				result = employeeRepository.addNewEmployee(employee);
				if(result)
					System.out.println("Employee Added Succeffully");
				else
					System.out.println("Employee Addition failed");
				break;
			case 2:
				System.out.println(" Enter Employee ID whose salary you want to update");
				employeeId = scanner.nextInt();
				System.out.println(" Enter Updated Salary");
				salary = scanner.nextDouble();
				result = employeeRepository.updateSingleEmployee(employeeId, salary);
				if (result)
					System.out.println("Salary Updated");
				else
					System.out.println("Updation failed");
				break;
			case 3:
				System.out.println(" Enter Employee ID whose details you want to check");
				employeeId = scanner.nextInt();
				employee = employeeRepository.getSingleEmployee(employeeId);
				if (employee == null)
					System.out.println("Employee not found");
				else
					System.out.println(employee);
				break;
			case 4:
				for(Employee e : employeeRepository.getAllEmployee())
					System.out.println(e);
				break;
			case 5:
				System.out.println(" Enter Employee ID you want to delete");
				employeeId = scanner.nextInt();
				employee = employeeRepository.getSingleEmployee(employeeId);
				if (employee == null)
					System.out.println("Employee not found");
				else
					System.out.println(employee);
				break;
			default:
				System.out.println("Incorrect Choice");
				break;
			}
			System.out.println("Do you want to continue");
			continuechoice = scanner.next();
		}while(continuechoice.equalsIgnoreCase("yes"));	
		if (continuechoice.equalsIgnoreCase("no"))
			System.out.println("You have selected " + continuechoice);
		System.out.println("Thanks for visiting");
	}

}
