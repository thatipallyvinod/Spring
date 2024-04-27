package com.sathya.spring;

public class Person {
	
	private String name;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void PersonInfo() {
		System.out.println("Hey "+name+" RAMADAN MUBHARAK");
		System.out.println("Check your "+email);
	}

}
