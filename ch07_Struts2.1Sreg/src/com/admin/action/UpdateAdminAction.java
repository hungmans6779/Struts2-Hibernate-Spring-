package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

public class UpdateAdminAction extends ActionSupport {

	private int id;             // 使用者id
	private String adminname;   // 使用者賬號
	private String password;    // 使用者密碼
	private String name;        // 使用者姓名
	private int qx;            // 許可權(1：普通管理員、2:高級管理員 - 擁有 增、刪、改 等權限)
	private String tip;         // 提示的 tip 屬性

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	
	
	// 修改系統管理者資訊
	public String updateAdmin() {
	  System.out.println(UpdateAdminAction.class.getName()+",updateAdmin()  execute...");
	  System.out.println("01. id        = "+id);
	  System.out.println("02. adminname = "+adminname);
	  System.out.println("03. password  = "+password);
	  System.out.println("04. name      = "+name);
	  System.out.println("05. qx        = "+qx);
	  
	
		
	  Admin admin = new Admin();
	  admin.setId(id);
	  admin.setAdminname(adminname);
	  admin.setPassword(password);
	  admin.setName(name);
	  admin.setQx(qx);
		
	  AdminDAO adminDAO = new AdminDAO();	  
	  int count = adminDAO.update(admin); // 修改管理者資訊
	  if(count > 0){
		return Action.SUCCESS;  
	  }else{
		this.setTip(this.getText("update.failed"));  
		return Action.INPUT;
      }

	} // end updateAdmin()

}
