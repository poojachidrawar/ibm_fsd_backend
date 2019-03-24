package com.java.spring.core.javabased.xmlconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class EmployeeAddressExJavaBasedXmlConfig {

	public static void main(String[] args) {
		
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeAnnotation.class);
		
		Employee emp = (Employee) context.getBean("employee");
		emp.printDetails();

	}

}
