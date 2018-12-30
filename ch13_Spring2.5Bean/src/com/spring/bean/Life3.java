package com.spring.bean;

import java.util.Date;


/*
 *  使用 BeanWrapper(org.springframework.beans.BeanWrapper)，不過使用該方式時，要求相應的 Bean 具有設值植入的 setter 方法，
 *  否則將不能使用 BeanWrapper 的 setPropertyValue() 方法進行初始化操作。
 */
public class Life3 {

  public String msg = null;
  public Date date = null;

  
  public void doLife() {
	System.out.println(Life3.class.getName()+ " ,doLife() method  execute...");
	System.out.println(msg);
	System.out.println("Todate is ：" + date);
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
