package aop.autoProxy.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.autoProxy.service.Reception;

/*
  基於 Advisor 比對機制的自動代理建立器：它會對容器中所有的 Advisor 進行掃描，自動將這些剖面應用到比對的Bean 中(即為目標 Bean 建立代理實例)，
                                         實現類別為 DefaultAdvisorAutoProxyCreator。
                                            
 */
public class Client1 {


  public static void main(String[] args) {
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_AutoProxyCreator1.xml");
    System.out.println("\n");
   
    Reception reception = (Reception) ac.getBean("receptionA");
    
    reception.serveCustomer("kevin");

  }

}
