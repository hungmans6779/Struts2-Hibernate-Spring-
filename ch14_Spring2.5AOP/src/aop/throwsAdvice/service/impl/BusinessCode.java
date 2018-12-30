package aop.throwsAdvice.service.impl;

public class BusinessCode {
	
  public void update() {
	System.out.println(BusinessCode.class.getName()+",update() execute...");

	throw new RuntimeException("°õ¦æ®É¨Ò¥~¡C");
  } // end update()
	
}
