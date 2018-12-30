package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport{

	private String loginname;
	private String password;

	public String getLoginname() {
		return loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	// ¥D¤èªk
	public String execute(){
	  System.out.println(AddUserAction.class.getName()+",execute()...");
	  System.out.println("loginname = "+loginname);
	  
	  
	  if(!"".equals(loginname) && loginname != null){
		 System.out.println("success");
		 return Action.SUCCESS;
	  }else{
		 System.out.println("input");
		 return Action.INPUT;   
	  }
	  
	} // end execute()
	
	

}
