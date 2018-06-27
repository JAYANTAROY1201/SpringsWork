package com.bridgelabz.spring.dependency_injection_by_constructor.dependent_object;

/**
 * Purpose:This class is designed as pojo class of address 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Address {
	private String city;
	private String state;
	private int zip;

	public Address() {
		System.out.println("This is Default constructor");
	}

	public Address(String city, String state, int zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
		System.out.println("This is parameterized object of Address class");
	}

	/**
	 * overridden toString method to print address details
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ("City: " + city + "\nState: " + state + "\nzip: " + zip);
	}
}
