package aop.throwsAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.throwsAdvice.service.impl.BusinessCode;

/*
 *  例外通知範例
 */
public class Client_ThrowsAdvice {

  public static void main(String[] args) {
	
	// 產生實際容器
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// 代理物件
	BusinessCode bc = (BusinessCode)ac.getBean("advice_throws");
	
	// 執行方法
	bc.update();

  } // end main

}
