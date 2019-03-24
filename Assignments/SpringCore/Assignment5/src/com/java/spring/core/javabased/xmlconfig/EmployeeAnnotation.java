package com.java.spring.core.javabased.xmlconfig;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeAnnotation {
	
	@Bean
	public Employee employee() {
		
		LocalDate dob = LocalDate.of(1996, 01, 23);
		
		List skill = new ArrayList();
		skill.add("Java");
		skill.add("UI");
		skill.add("DB");
		return new Employee(101,"Pooja",dob,"manager",50000,skill);
		
	}
	
	@Bean
	public Address address() {
		return new Address("Parbhani","India",431401);
	}
}
