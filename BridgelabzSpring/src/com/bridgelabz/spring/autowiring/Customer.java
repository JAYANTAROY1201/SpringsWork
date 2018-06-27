package com.bridgelabz.spring.autowiring;

/**
 * Purpose: This class is designed as pojo class of customer
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Customer {
	private String name;
	private Address address;

	public Customer() {
		System.out.println("def cons of customer");
	}

	public Customer(Address address) {
		System.out.println("param cons of customer");
		this.address = address;
	}

	/**
	 * This method is written to set name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method is written to set address
	 * 
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * This method is written to display details
	 */
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Address:\n" + address);
	}
}
