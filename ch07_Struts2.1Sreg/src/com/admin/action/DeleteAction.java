package com.admin.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;

/*
 *  刪除一般使用者(table:users)
 */
public class DeleteAction extends ActionSupport {

  private int id;     // 使用者 id
  private String tip; // 提示的 tip 屬毀

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

	
  // 刪除使用者
  public String delete() {
    System.out.println(DeleteAction.class.getName()+",delete()  execute...");
    System.out.println("id = "+id);
      
    UsersDAO usersDAO = new UsersDAO();
    boolean flag = usersDAO.deleteUser(id);     // 刪除使用者
      
    if(flag){
      this.setTip(this.getText("delete.success"));  
      return Action.SUCCESS;
    }else{
      this.setTip(this.getText("delete.failed"));
      return Action.ERROR;
    }
     
  } // end delete

	
}