package aop.beforeAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


/*
 *  �e�m�q���A���b��k�Q�I�s���e�����@�ǰʧ@�C
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * method�G���ؼ����O����k;
	 * args�G�ؼй�Ҫ���k���ɤJ�Ѽ�;
	 * target�G���ؼ����O���;
	 */
	public void before(Method method,Object[] args,Object target) throws Throwable {
	  System.out.println(GreetingBeforeAdvice.class.getName()+",before() execute...");
	  System.out.println("simpleName = "+target.getClass().getSimpleName());
	  String customerName = (String)args[0];
	  System.out.println("����z�u�����G"+customerName+",�и�ڨӡI(�����ݭ�)");
	  System.out.println("\n");
	} // end  before

}
