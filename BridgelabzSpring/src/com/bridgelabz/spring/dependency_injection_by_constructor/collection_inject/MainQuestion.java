package com.bridgelabz.spring.dependency_injection_by_constructor.collection_inject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Purpose: This class is designed to test question class
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class MainQuestion {

	public static void main(String[] args) {
		Resource resourse = new ClassPathResource("UtilityXml.xml");
		BeanFactory factory = new XmlBeanFactory(resourse);
		Question ques = (Question) factory.getBean("questionbean");
		ques.print();
	}
}
