package com.java.spring.autowire.xmlconfig;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAddressAutowiringEx {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		
		Employee emp = (Employee) ctx.getBean("employee");
		
		emp.printDetails();
		ctx.close();
	}

}
