package com.action.validateFile;

import com.opensymphony.xwork2.Action;

public class ClientAction {

	private String userName;
	private String pass;

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
	
	
	// ¥D¤èªk
	public String execute(){
      System.out.println(ClientAction.class.getName());
      System.out.println("01.userName = "+userName);
      System.out.println("02.pass     = "+pass);
      
      
	  return Action.INPUT;	
	}

}
