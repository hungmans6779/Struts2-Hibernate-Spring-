package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.vo.Admin;

public class UpdateAdminAction extends ActionSupport {

	private int id;             // �ϥΪ�id
	private String adminname;   // �ϥΪ̽㸹
	private String password;    // �ϥΪ̱K�X
	private String name;        // �ϥΪ̩m�W
	private int qx;            // �\�i�v(1�G���q�޲z���B2:���ź޲z�� - �֦� �W�B�R�B�� ���v��)
	private String tip;         // ���ܪ� tip �ݩ�

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

	
	
	// �ק�t�κ޲z�̸�T
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
	  int count = adminDAO.update(admin); // �ק�޲z�̸�T
	  if(count > 0){
		return Action.SUCCESS;  
	  }else{
		this.setTip(this.getText("update.failed"));  
		return Action.INPUT;
      }

	} // end updateAdmin()

}
