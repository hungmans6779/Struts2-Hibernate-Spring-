package com.framework.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.UserDao;
import com.framework.entity.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

  private UserDao userDao;  // 使用者 DAO

  private String userName;
  private String userPassword;

  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  
  

  
  
  
  /*
   * 主功能
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  public String execute() throws Exception{
 
    boolean flag = userDao.loginByNP(userName,userPassword); //  使用者登入，判斷使用者名稱和密碼是否正確
    
    System.out.println("*************************************************************");
    System.out.println(LoginAction.class.getName());
    System.out.println("01.userName     = "+userName);
    System.out.println("02.userPassword = "+userPassword);
    System.out.println("03.flag         = "+flag);
    System.out.println("*************************************************************");
     
    User user = null;
    if(flag){
      HttpServletRequest request = ServletActionContext.getRequest();
      HttpSession session = request.getSession();
  
      user = userDao.getUserByName(userName);  // 根據使用者名稱查詢使用者資訊
      session.setAttribute("userId",user.getUserId());
      
      return SUCCESS;  
    }else{
      addFieldError("userName","使用者名稱或密碼錯誤！");
      
      return INPUT;
    }
  } // end execute()
  
  
  
  
  
  

}
