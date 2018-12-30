package com.spring.bean.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/*
	 * �b��l�� Bean ���e�I�s�Ӥ�k 
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		System.out.println(MyBeanPostProcessor.class.getName()+",postProcessBeforeInitialization() execute...");
		System.out.println("�t�Υ��b�ǳƹ� "+beanName+",�i���l��...");
		System.out.println("\n");
		return bean;
	} // end postProcessBeforeInitialization

	
	
	/*
	 * �b��l�� Bean ����I�s�Ӥ�k
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(MyBeanPostProcessor.class.getName()+",postProcessAfterInitialization() execute...");
		System.out.println("�t�Τw�g������ "+beanName+" ����l��");
		System.out.println("\n");
		
		if(bean instanceof Life){
		  Life life = (Life)bean;
		  life.setName("kevin");
		}
		
		return bean;
	} // end postProcessAfterInitialization


	
}