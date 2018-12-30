package aop.advisor.statics.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


/*
 *  �e�m�q���A���b��k�Q�I�s���e�����@�ǰʧ@�C
 */
public class PeopleBeforeAdvice implements MethodBeforeAdvice {
	
	
	/*
	 * (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 * 
	 * �b�ؼ����O����k����e��X�Ӥ�k���ݪ����O�W�H�θӤ�k���W�r
	 * 
	 * method�G���ؼ����O����k;
	 * args�G�ؼй�Ҫ���k���ɤJ�Ѽ�;
	 * target�G���ؼ����O���;
	 */
	public void before(Method method, Object[] args, Object target)throws Throwable {
      System.out.println(PeopleBeforeAdvice.class.getName()+", before() execute...");
	  System.out.println(target.getClass().getSimpleName()+" is "+method.getName()+" �I ");
	}
	

}
