package aop.beforeAdvice.service.impl;

import aop.beforeAdvice.service.Reception;


public class ConcreteReception implements Reception {

	public void serveCustomer(String customerName) {
	  System.out.println(ConcreteReception.class.getName()+",serveCustomer() execute...");
      System.out.println("�ڥ��b�A�ȫȤ�G"+customerName+"�C(���ݹL�{)");
      System.out.println("\n");
	} // end serveCustomer

}