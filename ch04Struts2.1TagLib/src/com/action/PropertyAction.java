package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PropertyAction extends ActionSupport {

	
  // ¥D¤èªk
  public String execute(){
	System.out.println(PropertyAction.class.getName()+",execute()...");  
	
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpSession session = request.getSession(true);
	
	request.setAttribute("param1","requestValue");
    session.setAttribute("param2","sessionValue");
	
	return Action.INPUT;  
  } // end execute()
  
  
  
}
