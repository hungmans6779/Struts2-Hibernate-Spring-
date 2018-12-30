package com.spring.client.bean.propertyOverrideConfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.propertyPlaceholderConfigurer.DB;
import com.spring.bean.propertyPlaceholderConfigurer.Security;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring_propertyOverrideConfigurer.xml");
		  
		  DB db = (DB)ac.getBean("jdbc");
		  db.out();
		  System.out.println("\n");
		 
		} // end main


}
