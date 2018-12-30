package com.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  IoC 方式：一般不推薦使用，因為該方式實現起來比較麻煩，並且與 Servlet API 耦合大。
 *  
 */
public class IocAction extends ActionSupport implements ServletRequestAware {

  private HttpServletRequest request = null;
  
  public void setServletRequest(HttpServletRequest request) {
	this.request = request;	
  }
	
  
  
  // 立方法
  public String execute(){
	System.out.println(NonIocAction.class.getName()+",execute()");

	HttpSession session = request.getSession(true);
	session.setAttribute("message","IoC 方式");

	return Action.INPUT;
  } // end execute()
  
  
  
	
}
