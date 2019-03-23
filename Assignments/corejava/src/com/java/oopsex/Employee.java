package com.java.oopsex;

public class Employee extends Person{
	
	private int id;
	private int salary;
	private String designation;
	
	public Employee() {
		this(101, 2000, 32, "john", "manager", "male");
	}
	
	public Employee(int id, int sal,int age, String name, String des, String gender){
		super(name, age, gender);
		this.id = id ;
		this.salary = sal;
		this.designation = des;
	}
	
	public int  getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public int  getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String  getDes() {
		return designation;
	}
	public void setDes(String des) {
		this.designation = des;
	}
	
	
	public void printDetails() {
		System.out.println("id is:"+this.getId());
		System.out.println("salary is:"+this.getSalary());
		System.out.println("designation is:"+this.getDes());
	}

}
