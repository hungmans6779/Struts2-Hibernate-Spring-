package aop.beforeAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.beforeAdvice.service.Reception;


/*
 *  Before Advice 範例
 *  
 *  Before Advice 就是前置通知，指在方法被呼叫之前完成一些動作。
 *  大家都知道，在客戶來時，接待人員見到客戶首先要做的是見面問候，不可以直上來就談客戶與公司生意，
 *  但是有的接待人員未必一定是這樣做，因此可能會損失客戶，所以這裡需要實現的是在見到客戶時，必須首先禮貌問候，
 *  簡單地說就是呼叫 serveCustomer（）方法之前執行一些動作。
 */
public class Client_BeforeAdvice {
	
  public static void main(String[] args) {

	// 產生實際容器
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// 代理物件
	Reception reception = (Reception)ac.getBean("reception_BeforeAdvice");
	  
    // 執行方法
	reception.serveCustomer("kevin");

  } // end main
 
}
