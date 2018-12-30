package com.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  IoC �覡�G�@�뤣���˨ϥΡA�]���Ӥ覡��{�_�Ӥ���·СA�åB�P Servlet API ���X�j�C
 *  
 */
public class IocAction extends ActionSupport implements ServletRequestAware {

  private HttpServletRequest request = null;
  
  public void setServletRequest(HttpServletRequest request) {
	this.request = request;	
  }
	
  
  
  // �ߤ�k
  public String execute(){
	System.out.println(NonIocAction.class.getName()+",execute()");

	HttpSession session = request.getSession(true);
	session.setAttribute("message","IoC �覡");

	return Action.INPUT;
  } // end execute()
  
  
  
	
}
