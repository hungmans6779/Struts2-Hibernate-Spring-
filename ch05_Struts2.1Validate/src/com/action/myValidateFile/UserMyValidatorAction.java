package com.action.myValidateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class UserMyValidatorAction extends ActionSupport {

	private String userName; // �ϥΪ̦W��
	private String pass;     // �K�X

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

	
	// �D��k
	public String execute() {
	  System.out.println(UserMyValidatorAction.class.getName()+ ",execute()...");
	  System.out.println("01.userName = " + userName);
	  System.out.println("02.pass     = " + pass);

	  return Action.SUCCESS;

	} // end execute()

}
