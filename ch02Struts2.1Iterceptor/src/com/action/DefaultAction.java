package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 登入請求 Action
 */
public class DefaultAction extends ActionSupport{


 
  // 主方法
  public String execute(){
	System.out.println(DefaultAction.class.getName()+",execute()...");
   
	return Action.SUCCESS;
  } // end execute

  
  
}
