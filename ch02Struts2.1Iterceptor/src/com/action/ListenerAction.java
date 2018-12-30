package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ListenerAction extends ActionSupport{

  // ¥D¤èªk
  public String execute(){
	System.out.println(ListenerAction.class.getName()+",execute()...");
	
    return Action.INPUT; 
  }
  
  
}
