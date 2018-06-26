package com.bridgelabz.spring.firstspring;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Purpose: This class is designed for test Student class
 * @author JAYANTA ROY
 * @version 1.0
 * @since 26/06/18
 */
public class MainStudent {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("UtilityXml.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();
	}
}


