package com.bridgelabz.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Purpose: This class is designed to test annotation
 * @author JAYANTA ROY
 * @version 1.0
 * @since 
 */
public class MainCustomerAddress {
	static Customer cust;

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("Autowiring.xml");
		System.out.println("\n---------printing by name--------");
		Customer cust = (Customer) factory.getBean("byname");
		cust.display();
		System.out.println("\n-----------printing by type----------------");
		cust = (Customer) factory.getBean("bytype");
		cust.display();
		System.out.println("\n-----printing by constructor-----------");
		cust = (Customer) factory.getBean("byconstructor");
		cust.display();
	}

}
