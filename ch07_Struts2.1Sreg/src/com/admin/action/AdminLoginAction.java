package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

/* 
 *  系統管理者權限登入
 */
public class AdminLoginAction extends ActionSupport {

	private String adminname;   // 系統管理者帳號
	private String password;    // 密碼
	private String tip;         // 服務器提示的tip屬性

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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	// 管理員登入
	public String adminLogin() throws Exception {
      System.out.println(AdminLoginAction.class.getName()+",adminLogin() execute...");
      System.out.println("01. adminname = "+adminname);
      System.out.println("02. password  = "+password);
      
      Admin admin = new Admin();
      admin.setAdminname(adminname);
      admin.setPassword(password);
    
      AdminDAO adminDAO = new AdminDAO();
      boolean flag = adminDAO.login(admin);
      if(flag){
    	ActionContext.getContext().getSession().put("qx",admin.getQx());
    	ActionContext.getContext().getSession().put("adminname",adminname);
    	ActionContext.getContext().getSession().put("username",adminname);
    	
    	return Action.SUCCESS;
      }else{
    	this.setTip(this.getText("login.failed"));  
    	
    	return Action.INPUT;
      }
      
	} // end adminLogin() 
	
	
	

}
