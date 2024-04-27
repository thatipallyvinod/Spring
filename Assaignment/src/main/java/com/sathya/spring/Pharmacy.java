package com.sathya.spring;

public class Pharmacy {

	private String name;
	private String location;
	
	
	/*public Pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}*/
	
	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}



	public void pharInfo() {
		System.out.println("Pharmacy name: "+name);
		System.out.println("pharmacy location: "+location);
	}


	
}
