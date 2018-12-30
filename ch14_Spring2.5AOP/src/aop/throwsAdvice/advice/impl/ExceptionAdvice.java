package aop.throwsAdvice.advice.impl;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/*
 * 
 *  ThrowsAdvice �ҥ~�q���A�ΨӳB�z�b��k�I�s�L�{�����ͪ����~�Ϊ̩ߥX���ҥ~�C
 *  ThrowsAdvice �w�q�b�ҥ~�o�ͮɸӦ�����ʧ@�C�P�e���X�سq�����A���P�A ThrowsAdvice �O�@���ѧO�����A���S���w�q���󥲶���{����k�C
 *  ���O�A��{�o�Ӥ��������O�����ܤ֦��@�Ӧp�U�Φ����k�G
 *  
 *  �� void afterThrowing(Thowable throwable)  
 *  �� void afterThrowing(Method method,Object[] args,Object target,Thowable throwable)
 *  �� afterThrowing(Method method,Object[] args,Object target,Exception ex)
 *      .
 *      .
 *      .
 *  
 */
public class ExceptionAdvice implements ThrowsAdvice {

  public void afterThrowing(Method method,Object[] args,Object target,Exception ex){
	System.out.println(ExceptionAdvice.class.getName()+",afterThrowing() execute...");
	
	System.out.println("method   = "+method.getName());
	System.out.println("�ߥX�ҥ~ = "+ex.getMessage());
  } // end  afterThrowing
  
}
