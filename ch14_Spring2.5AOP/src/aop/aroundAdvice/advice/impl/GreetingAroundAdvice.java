package aop.aroundAdvice.advice.impl;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/*
 *  ��¶�q���A�O�̱`�Ϊ��q�����A�C�e�m�q���M��m�q�����O�b�ؼ����O��k���e��´�J�q���A���O�p�G�P�ɨϥγo��ث��A���q���A
 *  �ä������P�ɹ�{�o��ӳq�����A�A�]���ϥ���¶�q���P�˥i�H��{�o�خĪG�C
 *  
 *  ��¶�q����{������ MethodInterceptor�A�P�e��سq�������I���n�ϧO�C 
 *  �� MethodInterceptor �������ؼФ�k�O�_�u���Q�I�s�C�z�L�I�s MethodInterceptor.proceed() ��k�өI�s�ؼФ�k�C
 *                       �o�@�I���P�� MethodBeforeAdvice�A�ؼФ�k�`�O�Q�I�s�A���D�ߥX�ҥ~�C
 *  �� MethodInterceptor �i�H����Ǧ^������A�]�N�O�i�H�Ǧ^�@�ӻP proceed() ��k�Ǧ^�����󧹥����P������C
 *                       �ϥ� AfterReturningAdvice �i�H�Ǧ^����A���O����Ǧ^�@�Ӥ��P������C
 *                       �� MethodInterceptor �i�H�Ǧ^���P������A��[�F���C
 *  
 */
public class GreetingAroundAdvice implements MethodInterceptor {

  public Object invoke(MethodInvocation invocation) throws Throwable {
	
	System.out.println(GreetingAroundAdvice.class.getName()+",invoke() execute...");

	// �ؼФ�k�ɤJ�Ѽ�
	Object [] args = invocation.getArguments();
	String customerName = (String)args[0];
	
	// �b�ؼа���e�I�s
	System.out.println(customerName+", ����z�u�����I�w���ӡI(�ݭ�)");
	System.out.println("\n");
	
	// �z�L�Ϯg�I�s�����k
	Object obj = invocation.proceed();
	
	// �b�ؼФ�k�����I�s 
	System.out.println(GreetingAroundAdvice.class.getName()+",invoke() execute...");
	System.out.println(customerName+",�P�z�ͪ��ܴr�֡I�кC��(�i�O)");
	
	return obj;
  } // end invoke
  

}
