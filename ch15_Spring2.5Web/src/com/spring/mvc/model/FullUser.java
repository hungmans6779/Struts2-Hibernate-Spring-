package com.spring.mvc.model;

public class FullUser {
  
  
  private int id;
  
  // 基本資訊
  private String username;
  private String password;
  private String email;
  
  // 聯繫資訊
  private String address;
  private String tel;
  
  // 調查資訊
  private String favor;

  
 
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getFavor() {
    return favor;
  }

  public void setFavor(String favor) {
    this.favor = favor;
  }
  
  
  
}
