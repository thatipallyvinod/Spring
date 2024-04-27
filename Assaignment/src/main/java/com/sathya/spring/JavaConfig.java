package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

   //For Constructor's
	
	/*@Bean
    public Doctor doctor1() {
        Doctor doctor = new Doctor(12,"Vali");
        return doctor;
    }

    @Bean
    public Pharmacy pharmacy1() {
        Pharmacy pharmacy = new Pharmacy("KM Pharmacy", "Ameerpet");
        return pharmacy;
    }

    @Bean
    public Patient patient1() {
        Patient patient = new Patient("khasim", 20, doctor1(), pharmacy1());
        return patient;
    }*/
	
	//For Getters and Setters
	
	public Doctor doctor1() {
        Doctor doctor = new Doctor();
        doctor.setId(143);
        doctor.setName("Khasim");
        return doctor;
    }

    @Bean
    public Pharmacy pharmacy1() {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setLocation("Metro");
        pharmacy.setName("KV pharmacy");
        return pharmacy;
    }

    @Bean
    public Patient patient1() {
        Patient patient = new Patient();
        patient.setName("Vinod");
        patient.setAge(20);
        patient.setDoctor(doctor1());
        patient.setPharmacy(pharmacy1());
        return patient;
    }

}
