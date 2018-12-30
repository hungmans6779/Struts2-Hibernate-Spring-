package aop.advisor.statics.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.statics.People;


/*
 *  �ϥ� Spring �R�A Pointcut(���J�I)
 *     
 *  �R�A���J�I�b�N�z�إ߮ɫإߤ@���A�Ӥ��O�b��������C���I�s��k�ɳ�����A�ҥH�ʯ��ʺA���J�I�٦n�A�O���諸���J�I�覡�C
 *  �R�A�Y��ܤ��ܡA�Ҧp��k�M���O���W�١C�]���i�H�ھ����O�M��k��ñ�W�ӧP�w�������O�����Ǥ�k�b�w�q�����J�I�����B�������ӳQ�L�o�ư��C
 *  
 *  �b Spring ���w�q�F�p�U����R�A���J�I����{���O�C    
 *  �� StaticMethodMatcherPointcut�G�@�ө�H���R�A Pointcut�A������Q���͹�{�C�}�o�̥i�H�ۤv�X�R�����O�ӹ�{�ۭq�����J�I�C
 *  �� NameMatchMethodPointcut�G�u����k�W�i��P�O���R�A Pointcut ��{���O�C
 *  
 *  
 *  ���ҨϥΤF StaticMethodMatcherPointcut �����O�C
 *  
 */
public class Client {
	
  public static void main(String[] args) {
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_PointcutAdivsor.xml");
    System.out.println("\n");
	
	People people = (People)ac.getBean("proxyFactoryBean_StaticMethodMatcherPointcut");
	
	people.speaking();
	people.running();
	people.loving();
	people.died();

  } // end main

  
}
