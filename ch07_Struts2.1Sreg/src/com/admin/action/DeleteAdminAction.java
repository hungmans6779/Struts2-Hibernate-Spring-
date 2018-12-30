package com.admin.action;

import com.admin.dao.AdminDAO;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAdminAction extends ActionSupport {

	private int id;     // �޲z��id
	private String tip; // �A�Ⱦ����ܪ�tip�ݩ�

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

	
	
	// �R���t�κ޲z��
	public String deleteAdmin() throws Exception {
      System.out.println(DeleteAdminAction.class.getName()+",deleteAdmin() execute...");
      System.out.println("01. id = "+id);
	
      AdminDAO adminDAO = new AdminDAO();
      boolean flag = adminDAO.deleteAdmin(id); // �R���t�κ޲z��  
      // �p�G��true��ܧR�����\
      if(flag){
    	this.setTip(this.getText("delete.success"));
    	return Action.SUCCESS;
      }else{
    	this.setTip(this.getText("delete.failed"));
    	return Action.ERROR;
      }
	} // deleteAdmin

	
}
