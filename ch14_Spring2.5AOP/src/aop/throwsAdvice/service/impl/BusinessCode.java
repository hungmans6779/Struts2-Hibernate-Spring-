package aop.throwsAdvice.service.impl;

public class BusinessCode {
	
  public void update() {
	System.out.println(BusinessCode.class.getName()+",update() execute...");

	throw new RuntimeException("����ɨҥ~�C");
  } // end update()
	
}
