package com.citibank.domain;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, firstName, lastName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
//	@Override
//	public int compare(Person p1) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public int compareTo(Person p1) {
		// TODO Auto-generated method stub
		return (int) lastName.compareTo(p1.getLastName());
	}
//	@Override
//	public int compare(Person o1, Person o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}	
}
