package com.spring.service.impl;

import com.spring.service.Axe;
import com.spring.service.Person01;

/*
 *  �m�غc�ӤJ�n���覡
 */
public class Chinese02 implements Person01 {

  private Axe axe;
  
  // �غc�ȤJ���覡
  public Chinese02(Axe axe){
	this.axe = axe;  
  }
  
  
  public void useAxe() {
	System.out.println(axe.chop());
  }
  

}
