package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

public class FindAdminAction extends ActionSupport {

	private String id; // �t�κ޲z��

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// �o��Y�Ӻ޲z������T
	public String findAdmin() {
	  System.out.println(FindAdminAction.class.getName()+ ",findAdmin() execute...");
      System.out.println("id = "+id);
	  
	  AdminDAO adminDAO = new AdminDAO();
	  Admin admin = adminDAO.selectInfo(id);

	  System.out.println("kevintest admin = " + admin.getAdminname());
	  ActionContext.getContext().getSession().put("admin",admin);

	  return Action.SUCCESS;
	} // findAdmin()

}
