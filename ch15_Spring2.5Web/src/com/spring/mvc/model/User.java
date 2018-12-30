package com.spring.mvc.model;

public class User {

  private int uid;
  private String username;
  private String password;
  private String nowtime;

  public int getUid() {
    return uid;
  }

  public void setUid(int uid) {
    this.uid = uid;
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

  public String getNowtime() {
    return nowtime;
  }

  public void setNowtime(String nowtime) {
    this.nowtime = nowtime;
  }

  @Override
  public String toString() {
    return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", nowtime="
        + nowtime + "]";
  }



}
