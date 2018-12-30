package aop.afterReturningAdvice.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import aop.beforeAdvice.service.Reception;

/*
 *  後置通知範例
 */
public class Client_AfterReturningAdvice {

  public static void main(String[] args) {	
    /*	
	  XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-AOP_Advice.xml"));
	  Reception  reception = (Reception)factory.getBean("reception_AfterAdvice");
	  reception.serveCustomer("kevin");
    */
 
	// 產生實際容器
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// 代理物件
	Reception  reception = (Reception)ac.getBean("reception_AfterAdvice");
	
	// 執行方法
	reception.serveCustomer("kevin");
	
  } // end main

  
}
