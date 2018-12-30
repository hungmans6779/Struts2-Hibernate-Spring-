package com.struts2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  存取 ActionConext
 *      在Struts2.x 中，Action 已與 Servlet API 完全分離，這使得 Struts2.x 的 Action 具有更加靈活和低耦合的特性，
 *  與 Struts1.x 相比是個巨大的進步。雖然 Struts2.x 的 Action 已經與 Servlet API 完全分離，但在實現業務邏輯處理時，
 *  經常需要存取 Servlet 中的物件，例如 session、request 與 application 等。Struts2.x 提供一個名稱為 ActionContext 的類別，
 *  在 Action 中可以透過該類別獲得 Servlet API 。 
 * 
 */
public class LoginAction extends ActionSupport{

  private String username;
  private String password;
  
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
  
 
  
  
  // 登入檢驗
  public String checkLogin(){
	
	System.out.println(LoginAction.class.getName()+",checkLogin() execute.....");  
	System.out.println("01.username = "+username);
	System.out.println("02.password = "+password);
	
	
	// 獲得 ActionContext
	ActionContext ac = ActionContext.getContext();
	ac.getApplication().put("username",this.username);
	ac.getSession().put("username",this.username);
	
	
	if("kevin".equalsIgnoreCase(username) && "1234".equals(password)){
	   return Action.SUCCESS;
	}else{
	   return Action.INPUT;	
	}

  } // end checkLogin
  
  
  
}
