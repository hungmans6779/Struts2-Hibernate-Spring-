package com.spring.bean;

import java.util.Date;


/*
 *  �ϥ� BeanWrapper(org.springframework.beans.BeanWrapper)�A���L�ϥθӤ覡�ɡA�n�D������ Bean �㦳�]�ȴӤJ�� setter ��k�A
 *  �_�h�N����ϥ� BeanWrapper �� setPropertyValue() ��k�i���l�ƾާ@�C
 */
public class Life3 {

  public String msg = null;
  public Date date = null;

  
  public void doLife() {
	System.out.println(Life3.class.getName()+ " ,doLife() method  execute...");
	System.out.println(msg);
	System.out.println("Todate is �G" + date);
  } // end doLife() 

	
  public void setMsg(String msg) {
    System.out.println(Life3.class.getName()+ " ,setMsg() method  execute...");
    System.out.println("msg = "+msg);
	this.msg = msg;
  } // end setMsg

	
  public void setDate(Date date) {
	System.out.println(Life3.class.getName()+ " ,setDate() method  execute...");
	System.out.println("date = "+date);
	this.date = date;
  } // end setDate

  
}
