package com.admin.action;

import java.util.List;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

/*
 *  查看所有管理者 Action
 */
public class FindAllAdminAction extends ActionSupport{

	
  // 查看所有管理者  	
  public String findAllAdmin() throws Exception{

	 AdminDAO adminDAO = new AdminDAO();
	 List <Admin>list = adminDAO.findAllAdmin();
	 
	 ActionContext.getContext().put("list",list);
	 
	 return Action.SUCCESS;
  } // end findAllAdmin
  
  
  
}
