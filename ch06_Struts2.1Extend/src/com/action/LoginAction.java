package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String userName; // 用戶名稱
	private String pass;     // 用戶密碼
	private String tip;    

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	
	// 主方法
	public String execute(){
	  System.out.println(LoginAction.class.getName()+",execute()...");
	  System.out.println("01.userName = "+userName);
	  System.out.println("02.pass     = "+pass);
	  System.out.println("03.tip     = "+tip);
	  
	  this.tip = getText("login.success",new String[]{this.userName});
	  
	  
	  return Action.SUCCESS;
	} // end execute()

	
	
	
	// 登錄驗證
	public void validateLogin(){
	  System.out.println(LoginAction.class.getName()+",loginValidate()...");	
	  System.out.println("01.userName = "+userName);
	  System.out.println("02.pass     = "+pass);
	  
	  if(userName==null || userName.trim().length()==0){
		System.out.println("執行到 if userName 判斷！！！");
		addFieldError("userName1-Errormessage",getText("login.userName1.requiredFault"));  
	  }
	  
	} // end loginValidate()
	
	
	
	
	// 登錄
	public String login(){
	  System.out.println(LoginAction.class.getName()+",login()...");	
	  System.out.println("01.userName = "+userName);
	  System.out.println("02.pass     = "+pass);
	  
	  return Action.SUCCESS;
	} // end login()
	
	
	

	
}
