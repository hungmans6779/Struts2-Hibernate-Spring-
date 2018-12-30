package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.service.Person01;

/*
 *  設值植入與建構植入的範例
 */
public class Client01 {

  public static void main(String[] args) {  
	
	Person01 person01 = null;
	
	System.out.println("\n");  
	
	ApplicationContext ac = new FileSystemXmlApplicationContext("src/spring-beanInjection.xml");
    person01 = (Person01)ac.getBean("chinese01");
	person01.useAxe();
	System.out.println("\n"); 
	
    person01 = (Person01)ac.getBean("american01");
	person01.useAxe();
	System.out.println("\n"); 
	
	
    person01 = (Person01)ac.getBean("european01");
	person01.useAxe();
	System.out.println("\n"); 
	
	
    person01 = (Person01)ac.getBean("african01");
	person01.useAxe();
	System.out.println("\n"); 
	
  } // end main

}
