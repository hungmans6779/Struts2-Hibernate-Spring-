package aop.advisor.beforeAdvice.service;


public interface IAOPService {

  // 會被攔截
  public void start();
  
  // 會被攔截
  public void pos();
  
  // 會被攔截
  public void posTest();
  
  // 不會被攔截
  public void test();
  
}
