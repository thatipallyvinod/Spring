package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println( "Objects Are Created" );
      Person person =   context.getBean("person",Person.class);
      		person.details();
      			
        
    }
}
