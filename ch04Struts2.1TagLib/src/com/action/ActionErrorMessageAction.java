package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ActionErrorMessageAction extends ActionSupport {

	
  // �D��k
  public String execute(){
	
	// �w�q ActionError ��T
	addActionError("this is the first Error�I�I�I");
	addActionError("this is the second Error�I�I�I");
	  
	// �w�q ActionMessage
	addActionMessage("this is the first Message�I�I�I");
	addActionMessage("this is the second Message�I�I�I");
	
	return Action.INPUT;
  } // end execute()
  
  
}
