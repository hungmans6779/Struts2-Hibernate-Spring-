package aop.advisor.beforeAdvice.service.impl;

import aop.advisor.beforeAdvice.service.IAOPService;

/*
 * ��@ IAOPService ������
 */
public class AOPServiceImpl implements IAOPService {

  // �|�Q�d�I
  public void start() {
    System.out.println(AOPServiceImpl.class.getName() + ",start() execute...");
    System.out.println("\n");
  }

  // �|�Q�d�I
  public void pos() {
    System.out.println(AOPServiceImpl.class.getName() + ",pos() execute...");
    System.out.println("\n");
  }

  // �|�Q�d�I
  public void posTest() {
    System.out.println(AOPServiceImpl.class.getName() + ",posTest() execute...");
    System.out.println("\n");
  }

  // ���|�Q�d�I
  public void test() {
    System.out.println(AOPServiceImpl.class.getName() + ",test() execute...");
    System.out.println("\n");
  }

}
