package com.java.spring.core.annotation.xmlconfig;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("employee")
public class Employee {
	
	int id;
	String name;
	LocalDate dob;
	String designation;
	double salary;
	List skills;
	
	@Autowired
	Address address;
	boolean fulltime;
	
	public Employee() {
		
	}
	
	public Employee(Address address) {
		this.address = address;
	}
	
	public Employee(int id, String name, LocalDate dob, String designation, double salary, List skills) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.designation = designation;
		this.salary = salary;
		this.skills = skills;
	}
	
	
	public int getId() {
		return id;
	}
	
	@Value("101")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@Value("John")
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	@Value("Manager")
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	@Value("50000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public List getSkills() {
		return skills;
	}
	
	
	@Value(value="UI,Java,Dtabase")
	public void setSkills(List skills) {
		this.skills = skills;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean isFulltime() {
		return fulltime;
	}
	
	@Value("true")
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}
	
	public void printDetails() {
		System.out.println("Employee details are :");
		
		System.out.println("id :"+getId());
		System.out.println("name :"+getName());
		System.out.println("dob :"+getDob());
		System.out.println("designation :"+getDesignation());
		System.out.println("salary :"+getSalary());
		System.out.println("skills :"+getSkills());
		System.out.println("fulltime :"+isFulltime());
		System.out.println("address :"+address);
	}
}
