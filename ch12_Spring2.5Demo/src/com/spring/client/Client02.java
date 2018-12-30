package com.spring.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.spring.service.Person01;


/*
 *  《建構植入》的範例
 *  
 *  簡單的程式使用 BeanFactory 就可以了，但為了使用 Spring 提供的更多功能，可以使用更好的容器實現；ApplicationContext。
 *  
 *  表面上，ApplicationContext 跟 BeanFactory 一樣，都是載入 Bean 定義、捆綁它們、最後銷毀，
 *  但 ApplicationContext 還提供了下面的支援：
 *  ◆ ApplicationContext 提供了對 i18n 的支援。
 *  ◆ ApplicationContext 提供了一般的屬性資源的讀取。
 *  ◆ ApplicationContext 給事件提供了監聽器支援。
 *  
 *  因為這些額外的功能，ApplicationContext 比 BeanFactory 使用更加廣泛。只有在資源不足時，才使用 BeanFactory，例如手機裝置。
 *  除了 ApplicationContext 提供的額外功能， ApplicationContext 與 BeanFactory 另外一個很大的區別是一個單例載入方式不同。
 *  ◆ BeanFactory 在呼叫 getBean() 方法時載入。
 *  ◆ ApplicationContext 在初始化時載入所有的單例 Bean。這樣，可以保證用到這些單例 Bean 時就可以使用，而不用等待。
 *  
 */
public class Client02 {

	public static void main(String[] args) {
		
	  // 此項寫法的 spring 設定檔放在 /webapp 根目錄之下
	  ApplicationContext factory1 = new FileSystemXmlApplicationContext("spring-bean.xml");
			
      // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext factory2 = new FileSystemXmlApplicationContext("src/applicationContext.xml");
			
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  ApplicationContext factory3 = new ClassPathXmlApplicationContext("applicationContext.xml");

	  // 此項寫法的 spring 設定檔放在 /webapp 根目錄之下
	  XmlBeanFactory factory4 = new XmlBeanFactory(new FileSystemResource("spring-bean.xml"));

	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  XmlBeanFactory factory5 = new XmlBeanFactory(new FileSystemResource("src/applicationContext.xml"));
			
	  // 此項寫法的 spring 設定放在 /src 根目錄之下
	  XmlBeanFactory factory6 = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));    
      
      
	  Person01 bean = null;
	      
	  System.out.println("\n");
	  bean = (Person01)factory1.getBean("chinese02");
      bean.useAxe();
		  
	  System.out.println("\n");
	  bean = (Person01)factory2.getBean("chinese02");
	  bean.useAxe();
	  
      System.out.println("\n");
      bean = (Person01)factory3.getBean("chinese02");
	  bean.useAxe();
	  
	  System.out.println("\n");
	  bean = (Person01)factory4.getBean("chinese02");
	  bean.useAxe();
	
      System.out.println("\n");
      bean = (Person01)factory5.getBean("chinese02");
	  bean.useAxe();
	  
	  System.out.println("\n");
	  bean = (Person01)factory6.getBean("chinese02");
	  bean.useAxe();
	  
	} // end main

	
}
