package com.spring.bean.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	/*
	 * 在初始化 Bean 之前呼叫該方法 
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		System.out.println(MyBeanPostProcessor.class.getName()+",postProcessBeforeInitialization() execute...");
		System.out.println("系統正在準備對 "+beanName+",進行初始化...");
		System.out.println("\n");
		return bean;
	} // end postProcessBeforeInitialization

	
	
	/*
	 * 在初始化 Bean 之後呼叫該方法
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(MyBeanPostProcessor.class.getName()+",postProcessAfterInitialization() execute...");
		System.out.println("系統已經完成對 "+beanName+" 的初始化");
		System.out.println("\n");
		
		if(bean instanceof Life){
		  Life life = (Life)bean;
		  life.setName("kevin");
		}
		
		return bean;
	} // end postProcessAfterInitialization


	
}