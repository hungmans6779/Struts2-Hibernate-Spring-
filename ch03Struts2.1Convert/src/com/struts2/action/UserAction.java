package com.struts2.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 
 */
public class UserAction extends ActionSupport{
 
	
  private String username;  // 使用者名稱
  private int age;          // 年齡
  

  
  public String getUsername() {
	return username;
  }

  public void setUsername(String username) {
	this.username = username;
  }

  public int getAge() {
	return age;
  }

  public void setAge(int age) {
	this.age = age;
  }

  
  
  
  
  public String addUser(){
    System.out.println(UserAction.class.getName()+",addUser() execute...");	
    System.out.println("username = "+username);
    System.out.println("age      = "+age);
    
	return Action.INPUT;
  } // end addUser

  
  
  
  
  
  public String getAllUsers(){
	System.out.println(UserAction.class.getName()+",getAllUsers() execute...");
	
	HttpServletRequest request = ServletActionContext.getRequest();
    request.setAttribute("username",username);
	
	return Action.INPUT;  
  } // end getAllUsers
  
  
  
}
