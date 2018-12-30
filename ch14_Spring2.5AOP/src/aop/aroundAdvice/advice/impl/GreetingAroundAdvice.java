package aop.aroundAdvice.advice.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 *  環繞通知，是最常用的通知型態。前置通知和後置通知分別在目標類別方法的前後織入通知，但是如果同時使用這兩種型態的通知，
 *  並不必須同時實現這兩個通知型態，因為使用環繞通知同樣可以實現這種效果。
 *  
 *  環繞通知實現介面為 MethodInterceptor，與前兩種通知有兩點重要區別。 
 *  ● MethodInterceptor 能夠控制目標方法是否真的被呼叫。透過呼叫 MethodInterceptor.proceed() 方法來呼叫目標方法。
 *                       這一點不同於 MethodBeforeAdvice，目標方法總是被呼叫，除非拋出例外。
 *  ● MethodInterceptor 可以控制傳回的物件，也就是可以傳回一個與 proceed() 方法傳回的物件完全不同的物件。
 *                       使用 AfterReturningAdvice 可以傳回物件，但是不能傳回一個不同的物件。
 *                       而 MethodInterceptor 可以傳回不同的物件，更加靈活。
 *  
 */
public class GreetingAroundAdvice implements MethodInterceptor {

  public Object invoke(MethodInvocation invocation) throws Throwable {
	
	System.out.println(GreetingAroundAdvice.class.getName()+",invoke() execute...");

	// 目標方法導入參數
	Object [] args = invocation.getArguments();
	String customerName = (String)args[0];
	
	// 在目標執行前呼叫
	System.out.println(customerName+", 見到您真高興！歡迎到來！(問候)");
	System.out.println("\n");
	
	// 透過反射呼叫執行方法
	Object obj = invocation.proceed();
	
	// 在目標方法執行後呼叫 
	System.out.println(GreetingAroundAdvice.class.getName()+",invoke() execute...");
	System.out.println(customerName+",與您談的很愉快！請慢走(告別)");
	
	return obj;
  } // end invoke
  

}
