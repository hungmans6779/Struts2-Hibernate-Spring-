package aop.throwsAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/*
 * 
 *  ThrowsAdvice 例外通知，用來處理在方法呼叫過程中產生的錯誤或者拋出的例外。
 *  ThrowsAdvice 定義在例外發生時該有什麼動作。與前面幾種通知型態不同， ThrowsAdvice 是一個識別介面，它沒有定義任何必須實現的方法。
 *  但是，實現這個介面的類別必須至少有一個如下形式的法：
 *  
 *  ● void afterThrowing(Thowable throwable)  
 *  ● void afterThrowing(Method method,Object[] args,Object target,Thowable throwable)
 *  ● afterThrowing(Method method,Object[] args,Object target,Exception ex)
 *      .
 *      .
 *      .
 *  
 */
public class ExceptionAdvice implements ThrowsAdvice {

  public void afterThrowing(Method method,Object[] args,Object target,Exception ex){
	System.out.println(ExceptionAdvice.class.getName()+",afterThrowing() execute...");
	
	System.out.println("method   = "+method.getName());
	System.out.println("拋出例外 = "+ex.getMessage());
  } // end  afterThrowing
  
}
