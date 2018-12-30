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
 *  使用 BeanWrapper(org.springframework.beans.BeanWrapper)，不過使用該方式時，要求相應的 Bean 具有設值植入的 setter 方法，
 *  否則將不能使用 BeanWrapper 的 setPropertyValue() 方法進行初始化操作。
 */
public class Client03 {

  public static void main(String[] args) {
	 
	Life3 life3 = null;
	System.out.println("\n");
	
	
	// 此項寫法的 spring 設定放在 /src 根目錄之下
	XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
	life3 = (Life3)factory.getBean("life3");
	BeanWrapper bw1 = new BeanWrapperImpl(life3);       // 產生實體一個 BeanWrapper 
	bw1.setPropertyValue("msg","use BeanWrapper bw1");  // 設定屬性 msg 的初值
	bw1.setPropertyValue("date",new Date());            // 設定屬性 date 的初值
	life3.doLife();
	System.out.println("\n");
	
	
	// 此項寫法的 spring 設定放在 /src 根目錄之下
	ApplicationContext ac2 = new FileSystemXmlApplicationContext("src\\spring-bean.xml");	
	life3 = (Life3)ac2.getBean("life3");
	BeanWrapper bw2 = new BeanWrapperImpl(life3);
	bw2.setPropertyValue("msg","use BeanWrapper bw2");
	bw2.setPropertyValue("date",new Date());
	life3.doLife();
	System.out.println("\n");
	
	
	// 此項寫法的 spring 設定放在 /src 根目錄之下
	ApplicationContext ac3 = new ClassPathXmlApplicationContext("spring-bean.xml");	
	life3 = (Life3)ac3.getBean("life3");
	BeanWrapper bw3 = new BeanWrapperImpl(life3);
	bw3.setPropertyValue("msg","use BeanWrapper bw3");
	bw3.setPropertyValue("date",new Date());
	life3.doLife();
	System.out.println("\n");
	
	
	
  } // end main
  
  

}
