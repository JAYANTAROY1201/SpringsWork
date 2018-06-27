package com.bridgelabz.spring.dependency_injection_by_setter.injecting_premitive_string;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Purpose: 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class EmployeeMain {

	public static void main(String[] args) {
		Resource resourse = new ClassPathResource("Setters.xml");
		BeanFactory factory = new XmlBeanFactory(resourse);

		Employee emp = (Employee) factory.getBean("employeebean");
		emp.display();
	}
}
