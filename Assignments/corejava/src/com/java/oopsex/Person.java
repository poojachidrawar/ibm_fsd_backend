package com.java.oopsex;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		System.out.println("This is default constructor");
	}
	
	public Person(String name, int age, String gender) {
		
		this.age = age;
		this.name = name;
		this.gender = gender;
		
	}
	
	public void setId(int age) {
		this.age = age;
	}
	 public int getAge() {
		 return age;
	 }
	 
	 public void setName(String name) {
		 this.name=name;
	 }
	 public String getName() {
		 return name;
	 }
	 
	 public void setGender(String gender) {
		 this.gender= gender;
	 }
	 public String getGender() {
		 return gender;
	 }


}
