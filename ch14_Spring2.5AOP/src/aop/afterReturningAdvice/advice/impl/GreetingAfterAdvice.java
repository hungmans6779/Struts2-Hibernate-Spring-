package aop.afterReturningAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*
 *  ��m�q���O���b�ؼ����O��k�Q�I�s�����C
 *  
 *  
 *  ��m�q���ϱo�{���]�p�v�|��I�s����k�B�ǤJ���ѼƥH�ΥؼЪ���A�]�i�H��o�Q�q����k���Ǧ^�ȡC�o�Ӥ����]�N�Ǧ^�ŭȡC
 *  ���M�i�H�o��ؼФ�k���Ǧ^�ȡA���O��������Ǧ^�ȡC 
 */
public class GreetingAfterAdvice implements AfterReturningAdvice {

	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * returnObj�G�ؼй�Ҥ�k�Ǧ^�����G;
	 * method�G���ؼ����O����k;
	 * args�G�ؼй�Ҫ���k���ɤJ�Ѽ�;
	 * target�G���ؼ����O���;
	 */
	public void afterReturning(Object returnObj, Method method, Object[] args,Object target) throws Throwable {
	
	  System.out.println(GreetingAfterAdvice.class.getName()+",afterReturning() execute...");
	  System.out.println("simpleName = "+target.getClass().getSimpleName());
	  String customerName = (String)args[0];
	  System.out.println(customerName+"�I�P�z�ͪ��u�r�֡A�z�кC���I(�i�O)");
	  System.out.println("\n");
	  
	} // end afterReturning

  
}
