package aop.advisor.beforeAdvice.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import aop.advisor.beforeAdvice.service.IAOPService;
import aop.advisor.beforeAdvice.service.impl.AOPServiceImpl;


/*
 *  切入點(Pointcut) 範例
 *  
 *  此範例：分別執行 AOPServiceImpl  的所有方法 start() 、 pos()、posTest() 與 test()。
 *  Spring 將會在 start()、 pos() 與 posTest() 方法前增加攔截器，但 test() 方法前則不會增加。
 */
public class Client {


  public static void main(String[] args) {

    /*
    XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-AOP_PointcutAdivsor.xml"));
    
    IAOPService aoi2 = (IAOPService)factory.getBean("aopService_Pointcut");
    */
    
    ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_PointcutAdivsor.xml");
    System.out.println("\n");
    
    IAOPService aoi = (IAOPService)ac.getBean("proxyFactoryBean_NameMatchMethodPointcutAdvisor");

    aoi.start();
 
    aoi.pos();
 
    aoi.posTest();

    aoi.test();
    
  } // end main

  
}
