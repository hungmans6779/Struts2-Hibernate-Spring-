package com.spring.client.bean;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.bean.Life1;

public class Client01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  
	  Life1 life1 = null;
	  System.out.println("\n");
	  
	  
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
	  life1 = (Life1)factory.getBean("life1");
      life1.doLife();
      System.out.println("\n");
      
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext ac1 = new FileSystemXmlApplicationContext("src\\spring-bean.xml");
      life1 = (Life1)ac1.getBean("life1");
      life1.doLife();
      System.out.println("\n");
      
  	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext ac2 = new ClassPathXmlApplicationContext("spring-bean.xml");
      life1 = (Life1)ac2.getBean("life1");
      life1.doLife();
      System.out.println("\n");
      
	} // end main

	
}
