package com.sathya.springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Start the Spring Bean 
    	ApplicationContext context =new ClassPathXmlApplicationContext("spring-config.xml");
    	
        System.out.println( "********" );
        
        //Get The Bean
      Travelar travelar = context.getBean("travelar",Travelar.class);
      			
      travelar.startjourney();
    }
}
