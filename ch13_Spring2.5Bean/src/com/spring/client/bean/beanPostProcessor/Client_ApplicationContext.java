package com.spring.client.bean.beanPostProcessor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.beanPostProcessor.Life;


/*
 *  採用BeanFactory 作為 Spring 容器時，必須手動註冊 BeanPostProcessor 。而對於 ApplicationContext，則無須手動註冊。
 *  因為 ApplicationContext 可以自動檢測到容器中的 Bean 後處理器，並將其註冊成 BeanPostProcessor，並且會在 Bean 實例建立時自動啟動。
 *  
 *  ※ 使用 ApplicationContext 作為容器時，無須手動註冊 BeanPostProcessor。 
 *  因此如果須要使用 Bean 後處理器，建議使用 ApplicationContext ，而不使用 BeanFactory。
 */
public class Client_ApplicationContext {

	public static void main(String[] args) {
		
		
	  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring_beanPostProcessor.xml");
	  
	  System.out.println(Client_ApplicationContext.class.getName()+",應用程式開始初始化容器");
	  

	  // 獲得 Life 實例
	  Life life = (Life)ac.getBean("life");
	  
	  System.out.println(Client_ApplicationContext.class.getName()+",應用程式已經完成對 Life 產生實體");
	  
	  life.doSomethings();
	 
	} // end main

}
