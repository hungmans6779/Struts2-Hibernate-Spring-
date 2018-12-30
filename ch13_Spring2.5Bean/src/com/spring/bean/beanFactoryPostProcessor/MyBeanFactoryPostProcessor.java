package com.spring.bean.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	  System.out.println(MyBeanFactoryPostProcessor.class.getName()+",postProcessBeanFactory()  execute...");
	  System.out.println("系統正在對容器進行後處理..." );
	  System.out.println("\n");
	} // end postProcessBeanFactory

}
