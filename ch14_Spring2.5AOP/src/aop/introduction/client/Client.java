package aop.introduction.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.introduction.People;
import aop.introduction.interceptor.IExecuteTime;

public class Client {

  /**
   * @param args
   */
  public static void main(String[] args) {

    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_IntroductionAdvisor.xml");
    System.out.println("\n");
    
    People people = (People)ac.getBean("proxyFactoryBean_StaticMethodMatcherPointcut");
    people.loving();
    
    //  �j���૬ People ����
    IExecuteTime iet = (IExecuteTime)people;
    
    // �O���ɶ�
    iet.printExecuteTime();
  } // end main

}
