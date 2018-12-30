package com.spring.client.bean.beanPostProcessor;

import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import com.spring.bean.beanPostProcessor.Life;
import com.spring.bean.beanPostProcessor.MyBeanPostProcessor;


/*
 *  �ĥ�BeanFactory �@�� Spring �e���ɡA������ʵ��U BeanPostProcessor �C�ӹ�� ApplicationContext�A�h�L����ʵ��U�C
 *  �]�� ApplicationContext �i�H�۰��˴���e������ Bean ��B�z���A�ñN����U�� BeanPostProcessor�A�åB�|�b Bean ��ҫإ߮ɦ۰ʱҰʡC
 */
public class Client_XmlBeanFactory {


	public static void main(String[] args) {
		
		
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring_beanPostProcessor.xml"));
		
		MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
		
		// ���U��B�z��
		factory.addBeanPostProcessor(beanPostProcessor);
		
		System.out.println(Client_XmlBeanFactory.class.getName()+",���ε{���}�l��l�Ʈe��");
		
		// ��o Life ���
		Life life = (Life)factory.getBean("life");
		System.out.println(Client_XmlBeanFactory.class.getName()+",���ε{���w�g������ Life ���͹���");
		
	    life.doSomethings();
	    

	}

}
