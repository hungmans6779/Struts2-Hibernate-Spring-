package aop.advisor.statics.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


/*
 *  前置通知，指在方法被呼叫之前完成一些動作。
 */
public class PeopleBeforeAdvice implements MethodBeforeAdvice {
	
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * 在目標類別的方法執行前輸出該方法所屬的類別名以及該方法的名字
	 * 
	 * method：為目標類別的方法;
	 * args：目標實例的方法的導入參數;
	 * target：為目標類別實例;
	 */
	public void before(Method method, Object[] args, Object target)throws Throwable {
      System.out.println(PeopleBeforeAdvice.class.getName()+", before() execute...");
	  System.out.println(target.getClass().getSimpleName()+" is "+method.getName()+" ！ ");
	}
	

}
