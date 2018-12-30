package com.spring.bean;

import java.util.Date;

/*
 *  �Ѿ\���ʹ�
 *  (1) BeanFactory �� Bean ���ͩR�g��;
 *  (2) ApplicationContext �� Bean ���ͩR�g��;
 */
public class Life1 {

  public String msg = null;
  public Date date = null;
	  
  /*
   *  ��l�Ƥ�k�A�H�z�L init-method �ݩʳ]�w
   */
  public void init(){
	System.out.println(Life1.class.getName()+" ,init() method  execute...");
	msg = "Perfect Life�I";
	date = new Date();			
  }
	  
	  
  public void doLife(){
	System.out.println(Life1.class.getName()+" ,doLife() method  execute...");
	System.out.println("msg = "+msg);
	System.out.println("Todate is �G"+date);
  }
	  
	  
  /*
   *  �P����k�A�H�z�L destroy-method �ݩʳ]�w
   */
  public void destroy(){
	System.out.println(Life1.class.getName()+" ,destroy() method  execute...");
	msg = null;
	date = null;
  } // end destory
	  
  
}

