package aop.afterReturningAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*
 *  後置通知是指在目標類別方法被呼叫後執行。
 *  
 *  
 *  後置通知使得程式設計師會到呼叫的方法、傳入的參數以及目標物件，也可以獲得被通知方法的傳回值。這個介面也將傳回空值。
 *  雖然可以得到目標方法的傳回值，但是不能替換傳回值。 
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * returnObj：目標實例方法傳回的結果;
	 * method：為目標類別的方法;
	 * args：目標實例的方法的導入參數;
	 * target：為目標類別實例;
	 */
	public void afterReturning(Object returnObj, Method method, Object[] args,Object target) throws Throwable {
	
	  System.out.println(GreetingAfterAdvice.class.getName()+",afterReturning() execute...");
	  System.out.println("simpleName = "+target.getClass().getSimpleName());
	  String customerName = (String)args[0];
	  System.out.println(customerName+"！與您談的真愉快，您請慢走！(告別)");
	  System.out.println("\n");
	  
	} // end afterReturning

  
}
