package aop.advisor.beforeAdvice.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import aop.advisor.beforeAdvice.service.IAOPService;
import aop.advisor.beforeAdvice.service.impl.AOPServiceImpl;


/*
 *  ���J�I(Pointcut) �d��
 *  
 *  ���d�ҡG���O���� AOPServiceImpl  ���Ҧ���k start() �B pos()�BposTest() �P test()�C
 *  Spring �N�|�b start()�B pos() �P posTest() ��k�e�W�[�d�I���A�� test() ��k�e�h���|�W�[�C
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
