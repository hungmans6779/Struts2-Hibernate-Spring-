package com.spring.bean.event;

import org.springframework.context.ApplicationEvent;

/*
 *  �e���ƥ����O
 */
public class EmailEvent extends ApplicationEvent{

  String address;
  String text;
  
  public EmailEvent(Object source,String address,String text){
	 super(source);
	 this.address = address;
	 this.text = text;
  }
  
	
}
