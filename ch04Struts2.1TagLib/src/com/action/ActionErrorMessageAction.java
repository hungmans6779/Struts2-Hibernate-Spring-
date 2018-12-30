package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ActionErrorMessageAction extends ActionSupport {

	
  // 主方法
  public String execute(){
	
	// 定義 ActionError 資訊
	addActionError("this is the first Error！！！");
	addActionError("this is the second Error！！！");
	  
	// 定義 ActionMessage
	addActionMessage("this is the first Message！！！");
	addActionMessage("this is the second Message！！！");
	
	return Action.INPUT;
  } // end execute()
  
  
}
