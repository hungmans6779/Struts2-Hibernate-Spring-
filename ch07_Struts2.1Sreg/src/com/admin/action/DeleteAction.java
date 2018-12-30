package com.admin.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;

/*
 *  �R���@��ϥΪ�(table:users)
 */
public class DeleteAction extends ActionSupport {

  private int id;     // �ϥΪ� id
  private String tip; // ���ܪ� tip �ݷ�

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

	
  // �R���ϥΪ�
  public String delete() {
    System.out.println(DeleteAction.class.getName()+",delete()  execute...");
    System.out.println("id = "+id);
      
    UsersDAO usersDAO = new UsersDAO();
    boolean flag = usersDAO.deleteUser(id);     // �R���ϥΪ�
      
    if(flag){
      this.setTip(this.getText("delete.success"));  
      return Action.SUCCESS;
    }else{
      this.setTip(this.getText("delete.failed"));
      return Action.ERROR;
    }
     
  } // end delete

	
}