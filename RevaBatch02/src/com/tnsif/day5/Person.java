package com.tnsif.day5;

public class Person {
	public static void main (String args[]) {
	
	//data members
	
	private String name;
	private String city;
	private int age;
	
	
	//getter and setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	//constructor
	
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@override
	
	
	
	
	


}
