package com.bridgelabz.spring.dependency_injection_by_constructor.collection_inject;

import java.util.Iterator;
import java.util.List;

/**
 * Purpose: This class is the pojo class of Question
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27/06/18
 */
public class Question {

	private int questionNo;
	private String question;
	private List<String> option;

	public Question(int questionNo, String question, List<String> option) {
		System.out.println("This is parameterized construcor of Question class");
		this.questionNo = questionNo;
		this.question = question;
		this.option = option;
	}

	public void print() {

		System.out.println("No.:" + questionNo);
		System.out.println("Question: " + question);
		System.out.println("Options:");
		Iterator<String> it = option.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
