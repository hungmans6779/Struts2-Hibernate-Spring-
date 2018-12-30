package com.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
 *  �DIoC �覡�G�@����˨ϥΡA�Y�z�L ActionContext �Ӧs�� Servlet API�A���O�u����o request�C
 *  
 */
public class NonIocAction extends ActionSupport{

  // �D��k
  public String execute(){
	System.out.println(IocAction.class.getName()+",execute()");
	HttpServletRequest request = ServletActionContext.getRequest();
	  
	HttpSession session = request.getSession(true);
	session.setAttribute("message","�DIoC �覡");

	return Action.INPUT;
  }
  
  
}
