package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class TimerInterceptorAction extends ActionSupport{

  // ¥D¤èªk 
  public String execute(){
    try{
      Thread.sleep(2000);	
    }catch(Exception e){
      e.printStackTrace();	
    }
   
    return Action.INPUT;
  } // end execute
  
  
}
