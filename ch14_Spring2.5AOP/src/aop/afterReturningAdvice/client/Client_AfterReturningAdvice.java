package aop.afterReturningAdvice.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import aop.beforeAdvice.service.Reception;

/*
 *  ��m�q���d��
 */
public class Client_AfterReturningAdvice {

  public static void main(String[] args) {	
    /*	
	  XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-AOP_Advice.xml"));
	  Reception  reception = (Reception)factory.getBean("reception_AfterAdvice");
	  reception.serveCustomer("kevin");
    */
 
	// ���͹�ڮe��
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// �N�z����
	Reception  reception = (Reception)ac.getBean("reception_AfterAdvice");
	
	// �����k
	reception.serveCustomer("kevin");
	
  } // end main

  
}
