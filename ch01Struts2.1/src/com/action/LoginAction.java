package com.action;

import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

  private String username;   // �n�J�W��
  private String password;   // �n�J�K�X

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


  // �n�J����
  public String checkLogin(){
	System.out.println(LoginAction.class.getName()+",checkLogin()...");
	
    if("kevin".equals(username) && "1234".equals(password)){
      return SUCCESS;	// �n�J���\
    }else{
      return LOGIN;    // �n�J����	
    }
    
  } // end checkLogin()
  
  
}
