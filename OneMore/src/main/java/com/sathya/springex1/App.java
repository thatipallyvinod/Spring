package com.sathya.springex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new  ClassPathXmlApplicationContext("spring-config1.xml");
    	
    	System.out.println( "*******" );
    	OneMoreImpl onemore =  context.getBean("one",OneMoreImpl.class);
    	onemore.once();
    }
}