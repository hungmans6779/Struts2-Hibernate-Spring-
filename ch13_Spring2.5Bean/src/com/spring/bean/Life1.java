package com.spring.bean;

import java.util.Date;

/*
 *  參閱活動圖
 *  (1) BeanFactory 中 Bean 的生命週期;
 *  (2) ApplicationContext 中 Bean 的生命週期;
 */
public class Life1 {

  public String msg = null;
  public Date date = null;
	  
  /*
   *  初始化方法，以透過 init-method 屬性設定
   */
  public void init(){
	System.out.println(Life1.class.getName()+" ,init() method  execute...");
	msg = "Perfect Life！";
	date = new Date();			
  }
	  
	  
  public void doLife(){
	System.out.println(Life1.class.getName()+" ,doLife() method  execute...");
	System.out.println("msg = "+msg);
	System.out.println("Todate is ："+date);
  }
	  
	  
  /*
   *  銷毀方法，以透過 destroy-method 屬性設定
   */
  public void destroy(){
	System.out.println(Life1.class.getName()+" ,destroy() method  execute...");
	msg = null;
	date = null;
  } // end destory
	  
  
}

