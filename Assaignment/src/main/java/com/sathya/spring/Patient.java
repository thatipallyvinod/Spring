package com.sathya.spring;

public class Patient {

	private String name;
	private int age;
	private Doctor doctor;
	private Pharmacy pharmacy;
	
	//Constructor
	
	/*public Patient(String name, int age, Doctor doctor, Pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}*/
	
	//Getters and Setters
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Pharmacy getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}
	
	
	//Method of Patient
	public void details() {
		System.out.println("Patient: "+name+" Welcome To Hospital");
		System.out.println("check your: "+age);
		doctor.doctorInfo();
		pharmacy.pharInfo();
	}
	
}