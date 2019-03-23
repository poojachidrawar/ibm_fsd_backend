package com.java.oopsex;

public class Contractor extends Person implements Appriasable{
	private int id;
	private int salary;
	private String designation;
	
	public Contractor(int id, int sal,int age, String name, String des, String gender){
		super(name, age, gender);
		this.id = id ;
		this.salary = sal;
		this.designation = des;
	}
	
	public Contractor() {
		// TODO Auto-generated constructor stub
		System.out.println("Child class of Person");
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

	@Override
	public void appraise() {
		System.out.println("It implements appriasable interface");
	}

}
