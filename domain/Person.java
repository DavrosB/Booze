package com.qa.exercises.domain;

public class Person {

	// Variables
	private String eyeColour;
	private String name;
	private int age;
	private String dob;

	// Default Constructor
	public Person() {
	}

	// Generate Constructor with Fields

	public Person(String eyeColour, String name, int age, String dob) {
		super();
		this.eyeColour = eyeColour;
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

//	create Getters and Setters
	public String getEyeColour() {
		return eyeColour;
	}

	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
