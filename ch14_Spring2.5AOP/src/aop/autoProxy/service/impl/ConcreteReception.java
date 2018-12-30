package aop.autoProxy.service.impl;

import aop.autoProxy.service.Reception;

public class ConcreteReception implements Reception {

  public void serveCustomer(String customerName) {
    System.out.println("我正在服務客戶：" + customerName + "。（接待過程）");
    System.out.println("\n");
  } // end serveCustomer

  
  public void s(String s) {
    System.out.println("Test!");
  } // end s


}
