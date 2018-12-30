package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;



public class PublicAction extends ActionSupport{

  private String title;      // ���D
  private String content;    // ���e
  
  public String getTitle() {
	return title;
  }
  
  public void setTitle(String title) {
	this.title = title;
  }
  
  public String getContent() {
	return content;
  }
  
  public void setContent(String content) {
	this.content = content;
  } 
  
 
  
  // �D��k
  public String execute(){
    System.out.println(PublicAction.class.getName()+",execute()....");
    System.out.println("01. title   = "+title);
    System.out.println("02. content = "+content);
    
 
	return Action.SUCCESS; 
  }
  
}
