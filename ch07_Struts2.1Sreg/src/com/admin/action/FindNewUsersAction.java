package com.admin.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;

/*
 *  �d�ݷs�W�ϥΪ�
 */
public class FindNewUsersAction extends ActionSupport{
	

  // �d�ݷs�W�ϥΪ�
  public String findNewUsers(){
    System.out.println(FindNewUsersAction.class.getName()+",findNewUsers()   execute...");
    
    UsersDAO usersDAO = new UsersDAO();
    List <UsersDAO> list = usersDAO.listNewUsers();
    
    ActionContext.getContext().put("list",list);
    
	return Action.SUCCESS;
  } // end findNewUsers()
  
  
}
