package aop.advisor.regexp.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.regexp.People;


/*
 *  �ϥ� Spring �R�A Pointcut(���J�I)
 *     
 *  ���ҨϥΤF RegexpMethodPointcutAdvisor �����O�C
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
