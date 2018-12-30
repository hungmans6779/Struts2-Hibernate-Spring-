package com.spring.client.bean.resourceBundleMessageSource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     
	  ApplicationContext ac =  new FileSystemXmlApplicationContext("src\\spring_messageSource.xml");
	  
	  String [] a = {"kevin"};
	  
	  String username = ac.getMessage("jdbc.username",a,Locale.getDefault());
	  String password = ac.getMessage("jdbc.password",a,Locale.getDefault());
	  
	  System.out.println("username = "+username);
	  System.out.println("password = "+password);
	  
	}

}
