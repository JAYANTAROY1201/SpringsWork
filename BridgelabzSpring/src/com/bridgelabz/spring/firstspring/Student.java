package com.bridgelabz.spring.firstspring;


/**
 * Purpose: This class is designed as a Student pojo class 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 26/6/18
 */
public class Student {
	private String name;  
	private String mobile;
	  
	public String getName() {  
	    return name;  
	}  
	public String getMobile() {  
	    return mobile;  
	} 
	  
	public void setName(String name) {  
	    this.name = name;  
	} 
	
	public void setMobile(String mobile) {  
	    this.mobile = mobile;  
	} 
	  
	public void displayInfo(){  
	    System.out.println("Name: "+name);  
	    System.out.println("Mobile: "+mobile); 
	}  
}
