package aop.aroundAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.beforeAdvice.service.Reception;

/*
 *  ��¶�q���d��
 */
public class Client_MethodInterceptor {

  public static void main(String[] args) {
		
	// ���͹�ڮe��
	ApplicationContext ac =  new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// �N�z����
	Reception reception = (Reception)ac.getBean("reception_AroundAdvice");
	
	// �����k
	reception.serveCustomer("kevin");
	
  } // end main
  

}
