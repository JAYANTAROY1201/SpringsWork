package com.bridgelabz.spring.dependency_injection_by_constructor.dependent_object;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Purpose: This class is the main class for testing person address
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18 
 */
public class MainPersonAddress {

	public static void main(String[] args) {

		Resource resourse = new ClassPathResource("UtilityXml.xml");
		BeanFactory factory = new XmlBeanFactory(resourse);
		Person p = (Person) factory.getBean("personbean");
		p.display();
		Person per = (Person) factory.getBean("per2");
		per.display();
	}
}
