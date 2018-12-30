package aop.beforeAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


/*
 *  前置通知，指在方法被呼叫之前完成一些動作。
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * method：為目標類別的方法;
	 * args：目標實例的方法的導入參數;
	 * target：為目標類別實例;
	 */
	public void before(Method method,Object[] args,Object target) throws Throwable {
	  System.out.println(GreetingBeforeAdvice.class.getName()+",before() execute...");
	  System.out.println("simpleName = "+target.getClass().getSimpleName());
	  String customerName = (String)args[0];
	  System.out.println("見到您真高興："+customerName+",請跟我來！(見面問候)");
	  System.out.println("\n");
	} // end  before

}
