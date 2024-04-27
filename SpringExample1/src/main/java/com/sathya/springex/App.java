package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//Start the Bean
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	System.out.println("kashim bhai");
    	
    	//Get the Object
    		GreetingsImpl greetings = context.getBean("greet",GreetingsImpl.class);
    		
    		//Call the Bean
    		greetings.greet();
    }  
}