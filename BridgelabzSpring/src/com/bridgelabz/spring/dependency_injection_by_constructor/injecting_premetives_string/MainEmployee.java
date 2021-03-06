package com.bridgelabz.spring.dependency_injection_by_constructor.injecting_premetives_string;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/**
 * Purpose: This class is designed for test Employee class
 * @author JAYANTA ROY
 * @version 1.0
 * @since 26/06/18
 */
public class MainEmployee {

	public static void main(String[] args) {
		Resource resourse = new ClassPathResource("UtilityXml.xml");
		BeanFactory factory = new XmlBeanFactory(resourse);

		Employee emp = (Employee) factory.getBean("employeebean");
		emp.show();
	}
}
