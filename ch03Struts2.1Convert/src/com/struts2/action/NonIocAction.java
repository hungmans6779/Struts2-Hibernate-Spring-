package com.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
 *  非IoC 方式：一般推薦使用，即透過 ActionContext 來存取 Servlet API，但是只能獲得 request。
 *  
 */
public class NonIocAction extends ActionSupport{

  // 主方法
  public String execute(){
	System.out.println(IocAction.class.getName()+",execute()");
	HttpServletRequest request = ServletActionContext.getRequest();
	  
	HttpSession session = request.getSession(true);
	session.setAttribute("message","非IoC 方式");

	return Action.INPUT;
  }
  
  
}
