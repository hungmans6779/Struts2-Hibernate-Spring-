package aop.throwsAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.throwsAdvice.service.impl.BusinessCode;

/*
 *  �ҥ~�q���d��
 */
public class Client_ThrowsAdvice {

  public static void main(String[] args) {
	
	// ���͹�ڮe��
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// �N�z����
	BusinessCode bc = (BusinessCode)ac.getBean("advice_throws");
	
	// �����k
	bc.update();

  } // end main

}
