package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

public class AddAdminAction extends ActionSupport {

	private String adminname; // �޲z���b��
	private String password;  // �޲z���K�X
	private String name;      // �޲z���m�W
	private int qx;          // �\�i�v(1�G���q�޲z���B2:���ź޲z�� - �֦� �W�B�R�B�� ���v��)
	private String tip;      // ���ܪ� tip �ݩ�



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

	
	
	
	// �W�[�t�κ޲z��
	public String addAdmin() {
    
	  System.out.println(AddAdminAction.class.getName()+",addAdmin()  execute...");
	  System.out.println("adminname = "+adminname);
	  System.out.println("password  = "+password);
	  System.out.println("name      = "+name);
	  System.out.println("qx        = "+qx);
	  
	  AdminDAO adminDAO = new AdminDAO();
	  boolean flag = adminDAO.findAdmin(adminname);  // �M��t�κ޲z�̦W�٬O�_�s�b
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
	  if(count >0){  // �j�� 0 ��ܵ��U���\
		this.setTip(this.getText("register.succ"));  
		return Action.SUCCESS;
	  }else{
	   this.setTip(this.getText("register.failed"));  
		return Action.INPUT;  
	  }
	 
	} // end addAdmin

	
	
}
