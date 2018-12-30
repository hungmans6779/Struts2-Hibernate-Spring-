package com.user.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

/*
 *  使用者登入 Action 類別
 */
public class LoginAction extends ActionSupport {

	private String username;   // 使用者名稱
	private String password;   // 密碼
	private String tip;        // 伺服器提示的 tip 屬性

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

	
	
	
	// 登入
	public String login() {
	  System.out.println(LoginAction.class.getName() + ",login() execute...");
	  System.out.println("01. username = " + username);
	  System.out.println("02. password = " + password);

	  Users users = new Users();
	  users.setUsername(username);
	  users.setPassword(password);

	  UsersDAO userDAO = new UsersDAO();
	  
	  boolean flag = userDAO.login(users);
	  if(flag){ // 登入成功 
		// 將使用者名稱存入session
		ActionContext.getContext().getSession().put("username",username);
		return Action.SUCCESS;
	  }else{    // 登入失敗 
        this.setTip(this.getText("login.failed"));
        return Action.INPUT;  // 登入失敗,傳回首頁
	  }
	  
	} // end login

	
}
