package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;

/*
 *  檢視所有使用者 Action
 *  
 *  作為尋找所有使用者的 Action 類別
 */
public class FindAllUsersAction extends ActionSupport {

	private String type;   // 參數表示從哪個頁面傳進來

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	// 尋找所有使用者
	public String findAllUsers(){
	  System.out.println(FindAllUsersAction.class.getName()+",findAllUsers() execute...");
	  System.out.println("type = "+type);
		
	  UsersDAO userDAO = new UsersDAO();  // 產生使用者 DAO 實體物件
	  
	  List list = userDAO.findAllUsers(); // 檢視所有使用者的資訊
	  System.out.println("list size = "+list.size());
	 
	  // 將 List 物件存放在 ActionContext 裡 
	  ActionContext.getContext().put("list",list);
	  if("admin".equals(type)){
		return "listAdminAllUsers";   // 顯示所有系統管理者資訊
	  }else if("users".equals(type)){
		return "listUserAllUsers";    // 顯示所有使用者管理者資訊
	  }else{
		return "listUserAllUsers";    // 顯示所有使用者管理者資訊  
	  }
	} // end findAllUsers
	
}