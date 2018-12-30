package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAdminAction extends ActionSupport {

	private int id;     // 管理員id
	private String tip; // 服務器提示的tip屬性

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	
	// 刪除系統管理者
	public String deleteAdmin() throws Exception {
      System.out.println(DeleteAdminAction.class.getName()+",deleteAdmin() execute...");
      System.out.println("01. id = "+id);
	
      AdminDAO adminDAO = new AdminDAO();
      boolean flag = adminDAO.deleteAdmin(id); // 刪除系統管理員  
      // 如果為true表示刪除成功
      if(flag){
    	this.setTip(this.getText("delete.success"));
    	return Action.SUCCESS;
      }else{
    	this.setTip(this.getText("delete.failed"));
    	return Action.ERROR;
      }
	} // deleteAdmin

	
}
