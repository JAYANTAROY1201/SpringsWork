package com.bridgelabz.spring.dependency_injection_by_setter.injecting_premitive_string;

/**
 * Purpose: This class is created as a pojo class of employee
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Employee 
{
	private int id;
	private String name;

	public Employee() 
	{
		System.out.println("this is default constructor");
	}

	/**
	 * This method is written to set id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * This method is written to get id 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * This method is written to set name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method is written to get name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is written to display employee details
	 */
	public void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
}
