package com.framework.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.framework.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {

  private UserDao userDao;       // 使用者 DAO 
  private FolderDao folderDao;   // 相冊表 DAO
  
  private String userName;       // 使用者名稱:
  private String userPassword;   // 使用者名稱:
  private String ruserPassword;  // 再輸入一次密碼
  private String userSex;        // 性別
  private String userBirthday;   // 生日
  private String userTelephone;  // 電話
  private String userEmail;      // 電子郵件
  private String userAddress;    // 地址 
  private String userRemark;     // 簡介
  
  
  
  
  public UserDao getUserDao() {
    return userDao;
  }

  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }

  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
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

  public String getRuserPassword() {
    return ruserPassword;
  }

  public void setRuserPassword(String ruserPassword) {
    this.ruserPassword = ruserPassword;
  }

  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }

  public String getUserBirthday() {
    return userBirthday;
  }

  public void setUserBirthday(String userBirthday) {
    this.userBirthday = userBirthday.substring(0,10);
  }

  public String getUserTelephone() {
    return userTelephone;
  }

  public void setUserTelephone(String userTelephone) {
    this.userTelephone = userTelephone;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public String getUserRemark() {
    return userRemark;
  }

  public void setUserRemark(String userRemark) {
    this.userRemark = userRemark;
  }


  
  
  

  /*
   * 主功能
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  public String execute() throws Exception{
   
   /*  
    HttpServletRequest request = ServletActionContext.getRequest();
    String userName = request.getParameter("userName");   // 使用者名稱
    System.out.println("userName = "+userName);
    */
    
    // 判斷使用者名稱是否存在
    if(userDao.findUsers(userName)){
      addFieldError("userName","使用者名稱已經存在！");
      return INPUT;
    }
    
    
    System.out.println("****************************************************");
    System.out.println(RegisterAction.class.getName());
    System.out.println("01.userName      = "+userName);
    System.out.println("02.userPassword  = "+userPassword);
    System.out.println("03.userSex       = "+userSex);
    System.out.println("04.userBirthday  = "+userBirthday);
    System.out.println("05.userTelephone = "+userTelephone);
    System.out.println("06.userEmail     = "+userEmail);
    System.out.println("07.userAddress   = "+userAddress);
    System.out.println("08.userRemark    = "+userRemark);
    System.out.println("****************************************************");
    
      
    // 使用者註冊成功，向資料表中增加紀錄
    int userId = userDao.saveUser(userName,userPassword,userSex,userBirthday,userTelephone,userEmail,userAddress,userRemark); 
    if(userId == 0){
      System.out.println("使用者註冊失敗");
      
      return INPUT;
    }else{
      System.out.println("使用者註冊成功");
      folderDao.saveFolder("預設相冊","預設相冊", userId);
      
      return SUCCESS;
    }
    
  } // end execute...
  
 

}
