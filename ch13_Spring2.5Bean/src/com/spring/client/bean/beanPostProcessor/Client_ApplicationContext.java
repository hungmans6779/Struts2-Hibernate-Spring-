package com.spring.client.bean.beanPostProcessor;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.beanPostProcessor.Life;


/*
 *  �ĥ�BeanFactory �@�� Spring �e���ɡA������ʵ��U BeanPostProcessor �C�ӹ�� ApplicationContext�A�h�L����ʵ��U�C
 *  �]�� ApplicationContext �i�H�۰��˴���e������ Bean ��B�z���A�ñN����U�� BeanPostProcessor�A�åB�|�b Bean ��ҫإ߮ɦ۰ʱҰʡC
 *  
 *  �� �ϥ� ApplicationContext �@���e���ɡA�L����ʵ��U BeanPostProcessor�C 
 *  �]���p�G���n�ϥ� Bean ��B�z���A��ĳ�ϥ� ApplicationContext �A�Ӥ��ϥ� BeanFactory�C
 */
public class Client_ApplicationContext {

	public static void main(String[] args) {
		
		
	  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring_beanPostProcessor.xml");
	  
	  System.out.println(Client_ApplicationContext.class.getName()+",���ε{���}�l��l�Ʈe��");
	  

	  // ��o Life ���
	  Life life = (Life)ac.getBean("life");
	  
	  System.out.println(Client_ApplicationContext.class.getName()+",���ε{���w�g������ Life ���͹���");
	  
	  life.doSomethings();
	 
	} // end main

}
