package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

public class AddAdminAction extends ActionSupport {

	private String adminname; // 管理員帳號
	private String password;  // 管理員密碼
	private String name;      // 管理員姓名
	private int qx;          // 許可權(1：普通管理員、2:高級管理員 - 擁有 增、刪、改 等權限)
	private String tip;      // 提示的 tip 屬性



	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQx() {
		return qx;
	}

	public void setQx(int qx) {
		this.qx = qx;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	
	
	// 增加系統管理者
	public String addAdmin() {
    
	  System.out.println(AddAdminAction.class.getName()+",addAdmin()  execute...");
	  System.out.println("adminname = "+adminname);
	  System.out.println("password  = "+password);
	  System.out.println("name      = "+name);
	  System.out.println("qx        = "+qx);
	  
	  AdminDAO adminDAO = new AdminDAO();
	  boolean flag = adminDAO.findAdmin(adminname);  // 尋找系統管理者名稱是否存在
	  System.out.println("flag = "+flag);
	  if(flag){
		this.setTip(this.getText("username.exist"));  
		return Action.INPUT;
	  }
	  
	  Admin admin = new Admin();
	  admin.setAdminname(adminname);
	  admin.setPassword(password);
	  admin.setName(name);
	  admin.setQx(qx);
	  int count = adminDAO.save(admin);
	  System.out.println("count = "+count);
	  if(count >0){  // 大於 0 表示註冊成功
		this.setTip(this.getText("register.succ"));  
		return Action.SUCCESS;
	  }else{
	   this.setTip(this.getText("register.failed"));  
		return Action.INPUT;  
	  }
	 
	} // end addAdmin

	
	
}
