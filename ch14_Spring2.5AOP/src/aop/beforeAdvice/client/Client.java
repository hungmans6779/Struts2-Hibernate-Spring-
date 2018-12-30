package aop.beforeAdvice.client;

import org.springframework.aop.BeforeAdvice;

import org.springframework.aop.framework.ProxyFactory;

import aop.beforeAdvice.advice.impl.GreetingBeforeAdvice;
import aop.beforeAdvice.service.Reception;
import aop.beforeAdvice.service.impl.ConcreteReception;

public class Client {

	public static void main(String[] args) {
      
	  // 接待人員
	  Reception target = new ConcreteReception();
	  
	  // 前置通知
	  BeforeAdvice advice = new GreetingBeforeAdvice();
	  
	  // Spring 代理工廠 
	  ProxyFactory pf = new ProxyFactory();
	  
	  pf.setTarget(target);
	  pf.addAdvice(advice);
	  
	  Reception proxy = (Reception)pf.getProxy();
	  proxy.serveCustomer("kevin"); 
	  
	} // end main

}
