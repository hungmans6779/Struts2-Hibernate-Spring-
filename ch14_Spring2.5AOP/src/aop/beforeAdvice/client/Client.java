package aop.beforeAdvice.client;

import org.springframework.aop.BeforeAdvice;

import org.springframework.aop.framework.ProxyFactory;

import aop.beforeAdvice.advice.impl.GreetingBeforeAdvice;
import aop.beforeAdvice.service.Reception;
import aop.beforeAdvice.service.impl.ConcreteReception;

public class Client {

	public static void main(String[] args) {
      
	  // ���ݤH��
	  Reception target = new ConcreteReception();
	  
	  // �e�m�q��
	  BeforeAdvice advice = new GreetingBeforeAdvice();
	  
	  // Spring �N�z�u�t 
	  ProxyFactory pf = new ProxyFactory();
	  
	  pf.setTarget(target);
	  pf.addAdvice(advice);
	  
	  Reception proxy = (Reception)pf.getProxy();
	  proxy.serveCustomer("kevin"); 
	  
	} // end main

}
