package com.spring.client.bean;

import java.util.Date;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.spring.bean.Life3;

/*
 *  �ϥ� BeanWrapper(org.springframework.beans.BeanWrapper)�A���L�ϥθӤ覡�ɡA�n�D������ Bean �㦳�]�ȴӤJ�� setter ��k�A
 *  �_�h�N����ϥ� BeanWrapper �� setPropertyValue() ��k�i���l�ƾާ@�C
 */
public class Client03 {

  public static void main(String[] args) {
	 
	Life3 life3 = null;
	System.out.println("\n");
	
	
	// �����g�k�� spring �]�w��b /src �ڥؿ����U
	XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
	life3 = (Life3)factory.getBean("life3");
	BeanWrapper bw1 = new BeanWrapperImpl(life3);       // ���͹���@�� BeanWrapper 
	bw1.setPropertyValue("msg","use BeanWrapper bw1");  // �]�w�ݩ� msg �����
	bw1.setPropertyValue("date",new Date());            // �]�w�ݩ� date �����
	life3.doLife();
	System.out.println("\n");
	
	
	// �����g�k�� spring �]�w��b /src �ڥؿ����U
	ApplicationContext ac2 = new FileSystemXmlApplicationContext("src\\spring-bean.xml");	
	life3 = (Life3)ac2.getBean("life3");
	BeanWrapper bw2 = new BeanWrapperImpl(life3);
	bw2.setPropertyValue("msg","use BeanWrapper bw2");
	bw2.setPropertyValue("date",new Date());
	life3.doLife();
	System.out.println("\n");
	
	
	// �����g�k�� spring �]�w��b /src �ڥؿ����U
	ApplicationContext ac3 = new ClassPathXmlApplicationContext("spring-bean.xml");	
	life3 = (Life3)ac3.getBean("life3");
	BeanWrapper bw3 = new BeanWrapperImpl(life3);
	bw3.setPropertyValue("msg","use BeanWrapper bw3");
	bw3.setPropertyValue("date",new Date());
	life3.doLife();
	System.out.println("\n");
	
	
	
  } // end main
  
  

}
