package aop.autoProxy.service.impl;

import aop.autoProxy.service.Reception;

public class ConcreteReception implements Reception {

  public void serveCustomer(String customerName) {
    System.out.println("�ڥ��b�A�ȫȤ�G" + customerName + "�C�]���ݹL�{�^");
    System.out.println("\n");
  } // end serveCustomer

  
  public void s(String s) {
    System.out.println("Test!");
  } // end s


}
