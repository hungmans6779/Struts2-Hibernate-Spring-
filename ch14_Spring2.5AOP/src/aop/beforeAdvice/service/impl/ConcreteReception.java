package aop.beforeAdvice.service.impl;

import aop.beforeAdvice.service.Reception;


public class ConcreteReception implements Reception {

	public void serveCustomer(String customerName) {
	  System.out.println(ConcreteReception.class.getName()+",serveCustomer() execute...");
      System.out.println("我正在服務客戶："+customerName+"。(接待過程)");
      System.out.println("\n");
	} // end serveCustomer

}