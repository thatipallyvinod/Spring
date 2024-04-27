package com.sathya.springex.SpringJavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//Start the bean
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println( "******" );
        
        //get the bean Object
      GreetingImpl greetingImpl = context.getBean("greet",GreetingImpl.class);
      greetingImpl.greet();
    }
}
