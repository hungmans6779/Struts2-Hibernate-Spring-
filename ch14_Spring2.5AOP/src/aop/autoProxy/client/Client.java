package aop.autoProxy.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.autoProxy.service.Reception;

/*
 *  ��� Bean �]�w�W�W�h���۰ʥN�z�إ߾��G���\���@�կS�w�]�w�W�� Bean �۰ʫإߥN�z��Ҫ��N�z�إ߾��A��{���O�� BeanNameAutoProxyCreator�C
 */
public class Client {

  public static void main(String[] args) {
    
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_AutoProxyCreator.xml");
    System.out.println("\n");
   
    Reception reception = (Reception) ac.getBean("receptionA");
    
    reception.serveCustomer("kevin");
       
  } // end main

}
