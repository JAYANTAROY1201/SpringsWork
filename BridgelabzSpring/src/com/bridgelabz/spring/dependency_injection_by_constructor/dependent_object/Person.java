package com.bridgelabz.spring.dependency_injection_by_constructor.dependent_object;

/**
 * Purpose: This class is designed a a pojo of person
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Person {

	private int id;
	private String name;
	private Address address;

	public Person() {
		System.out.println("This is default constructor of Person class");
	}

	public Person(int id, String name) {
		System.out.println("This is parameterized constructor of Person class with argument id and string");
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, Address address) {
		System.out.println("This is parameterized constructor of Person class");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	/**
	 * This method is written to display the persons details
	 */
	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: \n" + address);
	}
}
