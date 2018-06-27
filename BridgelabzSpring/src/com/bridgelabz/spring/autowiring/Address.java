package com.bridgelabz.spring.autowiring;

/**
 * Purpose: This class is designed as a pojo class of Address
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Address {
	private String city;
	private String zip;

	public Address() {
		System.out.println("def cons of address");
	}

	public Address(String city) {
		this.city = city;
	}

	public Address(String city, String zip) {
		this.city = city;
		this.zip = zip;
	}

	/**
	 * This method is written to set city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This method is written to set zip
	 * @param zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * overridden to string method to print details
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return ("City:" + city + "\nZIP: " + zip);
	}
}
