package com.framework.entity;

/*
 *  使用者
 */
public class User {

  private int userId;           // 使用者 ID
  private String userName;      // 使用者名稱
  private String userPassword;  // 使用者密碼
  private String userSex;       // 性別
  private String userBirthday;  // 生日
  private String userTelephone; // 電話
  private String userEmail;     // 電子郵件 E-mail
  private String userAddress;   // 地址
  private String userRemark;    // 簡介

  
  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
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
    this.userBirthday = userBirthday;
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



}
