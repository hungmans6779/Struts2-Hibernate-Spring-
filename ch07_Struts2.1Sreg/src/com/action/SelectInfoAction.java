package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class SelectInfoAction extends ActionSupport {

	private String username;  // �ϥΪ�W��
	private String type;      // ��ܱq���ӭ����Ƕi��

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

	
	
	
	
	// �˵��ϥΪ̭ӤH��T
	public String selectInfo(){	
	  System.out.println(SelectInfoAction.class.getName()+",selectInfo() execute...");
	  System.out.println("username = "+username);
	  System.out.println("type     = "+type);
		  
		   
	  UsersDAO usersDAO = new UsersDAO();                          // ���ͨϥΪ� DAO ���骫��
	  
	  Users users = usersDAO.selectInfo(username);                 // �˵��ϥΪ̭ӤH��T
	  ActionContext.getContext().getSession().put("users",users);  // �Nusers����s��bActionContext
  
	  if("admin".equals(type)){               // �i�j
		System.out.println("�޲z���˵��ϥΪ̸�T");
		  
		return "selectAdminInfo";  // �޲z���˵��ϥΪ̸�T(/form/admin/selectinfo.jsp)
	  }else if("allusers".equals(type)){     // �i�d�ݸԲӡj
		System.out.println("�ϥΪ��˵��Y�ӤH����T");
		
        return Action.INPUT; // �ϥΪ��˵��Y�ӤH����T(/form/user/showinfo.jsp)
	  }else if("users".equals(type)){         // �i�d�ݭӤH�T���j
		System.out.println("�ϥΪ��˵��ۤv��T");
		  
        return "selectUserInfo"; // �ϥΪ��˵��ۤv��T(/form/user/selectinfo.jsp)
	  }else{
		return Action.INPUT; // �ϥΪ��˵��Y�ӤH����T(/form/user/showinfo.jsp)
	  }
	  
	  
	} // end selectInfo

	
}
