package com.sathya.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Person personInfo1() {
		Person person = new Person();
		person.setName("khasim");
		person.setEmail("kv61460@gmail.com");
		return person;	
	}
	
	@Bean
	public Person personInfo2() {
		Person person = new Person();
		person.setName("vali");
		person.setEmail("vali143142@gmail.com");
		return person;	
	}
	
	@Bean
	public Person personInfo3() {
		Person person = new Person();
		person.setName("power");
		person.setEmail("power143142@gmail.com");
		return person;	
	}

}
