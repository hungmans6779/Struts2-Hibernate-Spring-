package com.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;

/*
 *  �˵��Ҧ��ϥΪ� Action
 *  
 *  �@���M��Ҧ��ϥΪ̪� Action ���O
 */
public class FindAllUsersAction extends ActionSupport {

	private String type;   // �Ѽƪ�ܱq���ӭ����Ƕi��

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	// �M��Ҧ��ϥΪ�
	public String findAllUsers(){
	  System.out.println(FindAllUsersAction.class.getName()+",findAllUsers() execute...");
	  System.out.println("type = "+type);
		
	  UsersDAO userDAO = new UsersDAO();  // ���ͨϥΪ� DAO ���骫��
	  
	  List list = userDAO.findAllUsers(); // �˵��Ҧ��ϥΪ̪���T
	  System.out.println("list size = "+list.size());
	 
	  // �N List ����s��b ActionContext �� 
	  ActionContext.getContext().put("list",list);
	  if("admin".equals(type)){
		return "listAdminAllUsers";   // ��ܩҦ��t�κ޲z�̸�T
	  }else if("users".equals(type)){
		return "listUserAllUsers";    // ��ܩҦ��ϥΪ̺޲z�̸�T
	  }else{
		return "listUserAllUsers";    // ��ܩҦ��ϥΪ̺޲z�̸�T  
	  }
	} // end findAllUsers
	
}