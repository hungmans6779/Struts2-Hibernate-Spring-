package aop.beforeAdvice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.beforeAdvice.service.Reception;


/*
 *  Before Advice �d��
 *  
 *  Before Advice �N�O�e�m�q���A���b��k�Q�I�s���e�����@�ǰʧ@�C
 *  �j�a�����D�A�b�Ȥ�ӮɡA���ݤH������Ȥ᭺���n�����O�����ݭԡA���i�H���W�ӴN�ͫȤ�P���q�ͷN�A
 *  ���O�������ݤH�������@�w�O�o�˰��A�]���i��|�l���Ȥ�A�ҥH�o�̻ݭn��{���O�b����Ȥ�ɡA��������§���ݭԡA
 *  ²��a���N�O�I�s serveCustomer�]�^��k���e����@�ǰʧ@�C
 */
public class Client_BeforeAdvice {
	
  public static void main(String[] args) {

	// ���͹�ڮe��
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_Advice.xml");
	System.out.println("\n");
	
	// �N�z����
	Reception reception = (Reception)ac.getBean("reception_BeforeAdvice");
	  
    // �����k
	reception.serveCustomer("kevin");

  } // end main
 
}
