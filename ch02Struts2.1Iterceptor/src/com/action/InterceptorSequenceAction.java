package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class InterceptorSequenceAction extends ActionSupport {

  // �D��k
  public String execute(){
	return Action.INPUT;  
  }
  
}
