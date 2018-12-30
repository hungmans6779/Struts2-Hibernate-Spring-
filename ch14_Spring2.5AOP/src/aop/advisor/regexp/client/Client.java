package aop.advisor.regexp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.regexp.People;


/*
 *  使用 Spring 靜態 Pointcut(切入點)
 *     
 *  本例使用了 RegexpMethodPointcutAdvisor 的類別。
 *  
 */
public class Client {


  public static void main(String[] args) {
    
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_PointcutAdivsor.xml");
    
    People people = (People)ac.getBean("proxyFactoryBean_RegexpMethodPointcutAdvisor");

    people.speaking();
    people.running();
    people.loving();
    people.died();
    
  } // end main

}
