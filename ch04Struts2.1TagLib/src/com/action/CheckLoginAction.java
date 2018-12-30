package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class CheckLoginAction extends ActionSupport {

	private String name;
	private String passwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	
	// ¥D¤èªk
	public String execute() {
	  System.out.println(CheckLoginAction.class.getName()+",execute()...");
	  System.out.println("name   = "+name);
	  System.out.println("passwd = "+passwd);
	  
	  return Action.SUCCESS;
	}

}
