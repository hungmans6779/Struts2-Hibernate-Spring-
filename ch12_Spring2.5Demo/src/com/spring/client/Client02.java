package com.spring.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.spring.service.Person01;


/*
 *  �m�غc�ӤJ�n���d��
 *  
 *  ²�檺�{���ϥ� BeanFactory �N�i�H�F�A�����F�ϥ� Spring ���Ѫ���h�\��A�i�H�ϥΧ�n���e����{�FApplicationContext�C
 *  
 *  ���W�AApplicationContext �� BeanFactory �@�ˡA���O���J Bean �w�q�B���j���̡B�̫�P���A
 *  �� ApplicationContext �ٴ��ѤF�U�����䴩�G
 *  �� ApplicationContext ���ѤF�� i18n ���䴩�C
 *  �� ApplicationContext ���ѤF�@�몺�ݩʸ귽��Ū���C
 *  �� ApplicationContext ���ƥ󴣨ѤF��ť���䴩�C
 *  
 *  �]���o���B�~���\��AApplicationContext �� BeanFactory �ϥΧ�[�s�x�C�u���b�귽�����ɡA�~�ϥ� BeanFactory�A�Ҧp����˸m�C
 *  ���F ApplicationContext ���Ѫ��B�~�\��A ApplicationContext �P BeanFactory �t�~�@�ӫܤj���ϧO�O�@�ӳ�Ҹ��J�覡���P�C
 *  �� BeanFactory �b�I�s getBean() ��k�ɸ��J�C
 *  �� ApplicationContext �b��l�Ʈɸ��J�Ҧ������ Bean�C�o�ˡA�i�H�O�ҥΨ�o�ǳ�� Bean �ɴN�i�H�ϥΡA�Ӥ��ε��ݡC
 *  
 */
public class Client02 {

	public static void main(String[] args) {
		
	  // �����g�k�� spring �]�w�ɩ�b /webapp �ڥؿ����U
	  ApplicationContext factory1 = new FileSystemXmlApplicationContext("spring-bean.xml");
			
      // �����g�k�� spring �]�w��b /src �ڥؿ����U
	  ApplicationContext factory2 = new FileSystemXmlApplicationContext("src/applicationContext.xml");
			
	  // �����g�k�� spring �]�w��b /src �ڥؿ����U
	  ApplicationContext factory3 = new ClassPathXmlApplicationContext("applicationContext.xml");

	  // �����g�k�� spring �]�w�ɩ�b /webapp �ڥؿ����U
	  XmlBeanFactory factory4 = new XmlBeanFactory(new FileSystemResource("spring-bean.xml"));

	  // �����g�k�� spring �]�w��b /src �ڥؿ����U
	  XmlBeanFactory factory5 = new XmlBeanFactory(new FileSystemResource("src/applicationContext.xml"));
			
	  // �����g�k�� spring �]�w��b /src �ڥؿ����U
	  XmlBeanFactory factory6 = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));    
      
      
	  Person01 bean = null;
	      
	  System.out.println("\n");
	  bean = (Person01)factory1.getBean("chinese02");
      bean.useAxe();
		  
	  System.out.println("\n");
	  bean = (Person01)factory2.getBean("chinese02");
	  bean.useAxe();
	  
      System.out.println("\n");
      bean = (Person01)factory3.getBean("chinese02");
	  bean.useAxe();
	  
	  System.out.println("\n");
	  bean = (Person01)factory4.getBean("chinese02");
	  bean.useAxe();
	
      System.out.println("\n");
      bean = (Person01)factory5.getBean("chinese02");
	  bean.useAxe();
	  
	  System.out.println("\n");
	  bean = (Person01)factory6.getBean("chinese02");
	  bean.useAxe();
	  
	} // end main

	
}
