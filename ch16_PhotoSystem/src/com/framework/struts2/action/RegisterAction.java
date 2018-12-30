package com.framework.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.framework.dao.UserDao;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {

  private UserDao userDao;       // �ϥΪ� DAO 
  private FolderDao folderDao;   // �ۥU�� DAO
  
  private String userName;       // �ϥΪ̦W��:
  private String userPassword;   // �ϥΪ̦W��:
  private String ruserPassword;  // �A��J�@���K�X
  private String userSex;        // �ʧO
  private String userBirthday;   // �ͤ�
  private String userTelephone;  // �q��
  private String userEmail;      // �q�l�l��
  private String userAddress;    // �a�} 
  private String userRemark;     // ²��
  
  
  
  
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
   * �D�\��
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  public String execute() throws Exception{
   
   /*  
    HttpServletRequest request = ServletActionContext.getRequest();
    String userName = request.getParameter("userName");   // �ϥΪ̦W��
    System.out.println("userName = "+userName);
    */
    
    // �P�_�ϥΪ̦W�٬O�_�s�b
    if(userDao.findUsers(userName)){
      addFieldError("userName","�ϥΪ̦W�٤w�g�s�b�I");
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
    
      
    // �ϥΪ̵��U���\�A�V��ƪ��W�[����
    int userId = userDao.saveUser(userName,userPassword,userSex,userBirthday,userTelephone,userEmail,userAddress,userRemark); 
    if(userId == 0){
      System.out.println("�ϥΪ̵��U����");
      
      return INPUT;
    }else{
      System.out.println("�ϥΪ̵��U���\");
      folderDao.saveFolder("�w�]�ۥU","�w�]�ۥU", userId);
      
      return SUCCESS;
    }
    
  } // end execute...
  
 

}
