package com.spring.bean.event;

import org.springframework.context.ApplicationEvent;

/*
 *  容器事件類別
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
