package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class SelectInfoAction extends ActionSupport {

	private String username;  // 使用表名稱
	private String type;      // 表示從哪個頁面傳進來

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	
	
	// 檢視使用者個人資訊
	public String selectInfo(){	
	  System.out.println(SelectInfoAction.class.getName()+",selectInfo() execute...");
	  System.out.println("username = "+username);
	  System.out.println("type     = "+type);
		  
		   
	  UsersDAO usersDAO = new UsersDAO();                          // 產生使用者 DAO 實體物件
	  
	  Users users = usersDAO.selectInfo(username);                 // 檢視使用者個人資訊
	  ActionContext.getContext().getSession().put("users",users);  // 將users物件存放在ActionContext
  
	  if("admin".equals(type)){               // 【】
		System.out.println("管理員檢視使用者資訊");
		  
		return "selectAdminInfo";  // 管理員檢視使用者資訊(/form/admin/selectinfo.jsp)
	  }else if("allusers".equals(type)){     // 【查看詳細】
		System.out.println("使用者檢視某個人員資訊");
		
        return Action.INPUT; // 使用者檢視某個人員資訊(/form/user/showinfo.jsp)
	  }else if("users".equals(type)){         // 【查看個人訊息】
		System.out.println("使用者檢視自己資訊");
		  
        return "selectUserInfo"; // 使用者檢視自己資訊(/form/user/selectinfo.jsp)
	  }else{
		return Action.INPUT; // 使用者檢視某個人員資訊(/form/user/showinfo.jsp)
	  }
	  
	  
	} // end selectInfo

	
}
