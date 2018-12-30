package com.user.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

/*
 *  �ϥΪ̵n�J Action ���O
 */
public class LoginAction extends ActionSupport {

	private String username;   // �ϥΪ̦W��
	private String password;   // �K�X
	private String tip;        // ���A�����ܪ� tip �ݩ�

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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	
	
	// �n�J
	public String login() {
	  System.out.println(LoginAction.class.getName() + ",login() execute...");
	  System.out.println("01. username = " + username);
	  System.out.println("02. password = " + password);

	  Users users = new Users();
	  users.setUsername(username);
	  users.setPassword(password);

	  UsersDAO userDAO = new UsersDAO();
	  
	  boolean flag = userDAO.login(users);
	  if(flag){ // �n�J���\ 
		// �N�ϥΪ̦W�٦s�Jsession
		ActionContext.getContext().getSession().put("username",username);
		return Action.SUCCESS;
	  }else{    // �n�J���� 
        this.setTip(this.getText("login.failed"));
        return Action.INPUT;  // �n�J����,�Ǧ^����
	  }
	  
	} // end login

	
}
