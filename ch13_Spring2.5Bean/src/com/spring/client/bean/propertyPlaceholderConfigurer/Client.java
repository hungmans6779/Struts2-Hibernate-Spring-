package com.spring.client.bean.propertyPlaceholderConfigurer;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.bean.propertyPlaceholderConfigurer.DB;
import com.spring.bean.propertyPlaceholderConfigurer.Security;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
	  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring_propertyPlaceholderConfigurer.xml");
	  
	  DB db = (DB)ac.getBean("property01");
	  db.out();
	  System.out.println("\n");
	  
	  Security security = (Security)ac.getBean("property02");
	  security.out();
	  
	} // end main

}
