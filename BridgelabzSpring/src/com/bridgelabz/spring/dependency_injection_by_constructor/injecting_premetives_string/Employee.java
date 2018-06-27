package com.bridgelabz.spring.dependency_injection_by_constructor.injecting_premetives_string;

/**
 * Purpose: This class is designed as a Employee pojo class
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 26/6/18
 */
public class Employee {
	private int id;
	private String name;

	public Employee() {
		System.out.println("this is default constructor");
	}

	public Employee(int id) {
		System.out.println("this is parameterized constructor argument int");
		this.id = id;
	}

	public Employee(String name) {
		System.out.println("this is parameterized constructor argument String");
		this.name = name;
	}

	public Employee(int id, String name) {
		System.out.println("this is parameterized constructor argument int and String of employee class");
		this.id = id;
		this.name = name;
	}

	/**
	 * This method is written to show details of employee
	 */
	void show() {
		System.out.println(id + " " + name);

	}
}
