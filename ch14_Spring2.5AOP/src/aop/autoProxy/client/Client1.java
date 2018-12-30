package aop.autoProxy.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.autoProxy.service.Reception;

/*
  ��� Advisor ������۰ʥN�z�إ߾��G���|��e�����Ҧ��� Advisor �i�汽�y�A�۰ʱN�o�ǭ孱���Ψ��諸Bean ��(�Y���ؼ� Bean �إߥN�z���)�A
                                         ��{���O�� DefaultAdvisorAutoProxyCreator�C
                                            
 */
public class Client1 {


  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_AutoProxyCreator1.xml");
    System.out.println("\n");
   
    Reception reception = (Reception) ac.getBean("receptionA");
    
    reception.serveCustomer("kevin");

  }

}
