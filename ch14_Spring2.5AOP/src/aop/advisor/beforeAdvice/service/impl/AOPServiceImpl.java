package aop.advisor.beforeAdvice.service.impl;

import aop.advisor.beforeAdvice.service.IAOPService;

/*
 * 實作 IAOPService 的介面
 */
public class AOPServiceImpl implements IAOPService {

  // 會被攔截
  public void start() {
    System.out.println(AOPServiceImpl.class.getName() + ",start() execute...");
    System.out.println("\n");
  }

  // 會被攔截
  public void pos() {
    System.out.println(AOPServiceImpl.class.getName() + ",pos() execute...");
    System.out.println("\n");
  }

  // 會被攔截
  public void posTest() {
    System.out.println(AOPServiceImpl.class.getName() + ",posTest() execute...");
    System.out.println("\n");
  }

  // 不會被攔截
  public void test() {
    System.out.println(AOPServiceImpl.class.getName() + ",test() execute...");
    System.out.println("\n");
  }

}
