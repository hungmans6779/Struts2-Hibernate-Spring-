package aop.aroundAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.beforeAdvice.service.Reception;

/*
 *  環繞通知範例
 */
public class Client_MethodInterceptor {

  public static void main(String[] args) {
		
	// 產生實際容器
	ApplicationContext ac =  new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// 代理物件
	Reception reception = (Reception)ac.getBean("reception_AroundAdvice");
	
	// 執行方法
	reception.serveCustomer("kevin");
	
  } // end main
  

}
