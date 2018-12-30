package com.spring.client.bean.beanPostProcessor;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import com.spring.bean.beanPostProcessor.Life;
import com.spring.bean.beanPostProcessor.MyBeanPostProcessor;


/*
 *  採用BeanFactory 作為 Spring 容器時，必須手動註冊 BeanPostProcessor 。而對於 ApplicationContext，則無須手動註冊。
 *  因為 ApplicationContext 可以自動檢測到容器中的 Bean 後處理器，並將其註冊成 BeanPostProcessor，並且會在 Bean 實例建立時自動啟動。
 */
public class Client_XmlBeanFactory {


	public static void main(String[] args) {
		
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring_beanPostProcessor.xml"));
		
		MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
		
		// 註冊後處理器
		factory.addBeanPostProcessor(beanPostProcessor);
		
		System.out.println(Client_XmlBeanFactory.class.getName()+",應用程式開始初始化容器");
		
		// 獲得 Life 實例
		Life life = (Life)factory.getBean("life");
		System.out.println(Client_XmlBeanFactory.class.getName()+",應用程式已經完成對 Life 產生實體");
		
	    life.doSomethings();
	    

	}

}
