package com.spring.service.impl;

import com.spring.service.Axe;
import com.spring.service.Person01;

/*
 *  《建構植入》的方式
 */
public class Chinese02 implements Person01 {

  private Axe axe;
  
  // 建構值入的方式
  public Chinese02(Axe axe){
	this.axe = axe;  
  }
  
  
  public void useAxe() {
	System.out.println(axe.chop());
  }
  

}
