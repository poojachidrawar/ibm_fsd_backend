package com.java.spring.core.annotation.xmlconfig;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class EmployeeAddressExUsingAnnotationConfig {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeAnnotation.class);
		
		Employee emp = (Employee) context.getBean("employee");
		
		LocalDate d1 = LocalDate.of(1996, 01, 23);
		
		emp.setDob(d1);
		emp.printDetails();

	}

}
