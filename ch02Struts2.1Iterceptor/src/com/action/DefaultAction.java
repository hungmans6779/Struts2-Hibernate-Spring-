package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 * �n�J�ШD Action
 */
public class DefaultAction extends ActionSupport{


 
  // �D��k
  public String execute(){
	System.out.println(DefaultAction.class.getName()+",execute()...");
   
	return Action.SUCCESS;
  } // end execute

  
  
}
