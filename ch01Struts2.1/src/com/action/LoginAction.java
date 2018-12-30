package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

  private String username;   // 登入名稱
  private String password;   // 登入密碼

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


  // 登入驗證
  public String checkLogin(){
	System.out.println(LoginAction.class.getName()+",checkLogin()...");
	
    if("kevin".equals(username) && "1234".equals(password)){
      return SUCCESS;	// 登入成功
    }else{
      return LOGIN;    // 登入失敗	
    }
    
  } // end checkLogin()
  
  
}
