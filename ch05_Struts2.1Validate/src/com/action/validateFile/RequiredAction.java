package com.action.validateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class RequiredAction extends ActionSupport {

	private String userName; // 姓名
	private String pass;     // 密碼


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

	
	
	// 主方法
	public String execute(){
	  System.out.println(RequiredAction.class.getName()+",execute()...");
	  System.out.println("01.userName = "+userName);
	  System.out.println("02.pass     = "+pass);
	  
	  return Action.SUCCESS;
	} // end execute()
	
	
	
	
}
