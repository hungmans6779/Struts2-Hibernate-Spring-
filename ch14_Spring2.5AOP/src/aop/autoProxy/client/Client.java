package aop.autoProxy.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.autoProxy.service.Reception;

/*
 *  基於 Bean 設定名規則的自動代理建立器：允許為一組特定設定名的 Bean 自動建立代理實例的代理建立器，實現類別為 BeanNameAutoProxyCreator。
 */
public class Client {

  public static void main(String[] args) {
    
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_AutoProxyCreator.xml");
    System.out.println("\n");
   
    Reception reception = (Reception) ac.getBean("receptionA");
    
    reception.serveCustomer("kevin");
       
  } // end main

}
