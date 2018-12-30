package com.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.Action;

public class LoginAction implements ServletContextAware,SessionAware,ServletRequestAware,ServletResponseAware {
  
  private ServletContext application;
  private Map session;
  private HttpServletRequest request;
  private HttpServletResponse response;
	
  public void setServletContext(ServletContext application) {
	this.application = application;
  }

  public void setSession(Map<String, Object> session) {
    this.session = session;
  }

  public void setServletRequest(HttpServletRequest request) {
	    this.request = request;
  }
  
  public void setServletResponse(HttpServletResponse response) {
	this.response = response;
  }


  private String username;  //  使用者名稱
  private String password;  //  密碼
  
  public String getUsername() {
	return username;
  }
  
  public void setUsername(String username) {
	this.username = username;
  }
  
  public String getPassword() {
	return password;
  }
  
  public void setPassword(String password) {
	this.password = password;
  }
  
  // 主方法
  public String execute(){
	System.out.println(LoginAction.class.getName()+",execute...");
	System.out.println("01.username = "+username);
	System.out.println("02.password = "+password);
	
	session.remove("message");

	if("kevin".equalsIgnoreCase(username) && "1234".equals(password)){
	  session.put("username",username);
	  
	  return Action.SUCCESS;	
	}else{
	  request.setAttribute("message","您的帳號或密碼錯誤！！！");
	  
	  return Action.LOGIN;	
	}
	
  } // end execute()
  
  
}
