package com.citibank.main;

import java.util.Arrays;
import java.util.Comparator;

import com.citibank.domain.Employee;
import com.citibank.domain.Person;

interface Condition{
	boolean test(Person person);
}
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("Payal", "Dharange", 1);
		Person person2 = new Person("Varsha", "Singh", 2);
		Person person3 = new Person("Prachi", "Sahuji",3);
		Person person4 = new Person("Rohit", "Dash", 4);
		
		Person[] persons = {person1, person2, person3, person4};
//		sortArrayByLastname(persons);
//		System.out.println("---------------");
		Arrays.sort(persons);
		Condition nocondition = (p) -> true; 
		printAll(persons,  nocondition);
		System.out.println("----------------");
		Condition startWithD = (p) -> {
			if ((p.getLastName()).startsWith("D"))
					return true;
			else
				return false;
		};
		printAll(persons,  startWithD);
//		printLastNameStartD(persons);
		System.out.println("--------------------");
		Condition endWithH = (p) -> {
			if ((p.getLastName()).endsWith("h")) return true;
			else  return false;
		};
		printAll(persons,  endWithH);
//		System.out.println("--------------------");
//		Condition sortedArray = (p) -> {
//			if (p.getLastName().compareTo(lastName))
//					return true;
//			else
//				return false;
//		};
//		printAll(persons,  sortedArray);
//		printLastNameEndH(persons);
		
	}
	
	
//	public static void sortArrayByLastname(Person[] person) {
//		Arrays.sort(person);
//		for (Person person2 : person) {
//			(person2.getLastName()).compareTo(null)
//			System.out.println(person2);
//		}
//	}
//	
	public static void printAll(Person[] person, Condition condition) {
		for (Person person2 : person) {
			if (condition.test(person2))
				System.out.println(person2);
			
		}	
	}
//	
//	public static void printLastNameStartD(Person[] person) {
//		for (Person person2 : person) {
//			if (person2.getLastName().startsWith("D"))
//				System.out.println(person2);
//		}
//	}
//	
//	public static void printLastNameEndH(Person[] person) {
//		for (Person person2 : person) {
//			if(person2.getLastName().endsWith("h"))
//				System.out.println(person2);
//		}
//	}
}