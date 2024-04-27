package com.sathya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        System.out.println( "FUCK YOU" );
        
       Person person =  context.getBean("personInfo1",Person.class);
       person.PersonInfo();
       
       Person person1 =  context.getBean("personInfo2",Person.class);
       person1.PersonInfo();
       
       Person person2 =  context.getBean("personInfo3",Person.class);
       person2.PersonInfo();
    }
}
