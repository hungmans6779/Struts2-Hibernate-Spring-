package com.spring.client.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.bean.Life1;
import com.spring.bean.Life2;

public class Client02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	  Life2 life2 = null;
	  System.out.println("\n");
		  
		  
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
	  life2 = (Life2)factory.getBean("life2");
	  life2.doLife();
	  System.out.println("\n");
	      
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext ac1 = new FileSystemXmlApplicationContext("src\\spring-bean.xml");
	  life2 = (Life2)ac1.getBean("life2");
	  life2.doLife();
	  System.out.println("\n");
	      
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring-bean.xml");
	  life2 = (Life2)ac2.getBean("life2");
	  life2.doLife();
	  System.out.println("\n");
	} // end main

	
}
