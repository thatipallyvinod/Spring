package com.sathya.springex.SpringJavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public GreetingImpl greet() {
	GreetingImpl greetingImpl = new GreetingImpl();
	return greetingImpl;
	}
}