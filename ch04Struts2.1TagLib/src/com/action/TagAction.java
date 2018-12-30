package com.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class TagAction extends ActionSupport {

  private String name;
  
  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }


  // ¥D¤èªk
  public String execute(){
	System.out.println(TagAction.class.getName()+",execute() execute...");
	  
	return "ok";  
  }
  
	
  public String login(){
	System.out.println(TagAction.class.getName()+",login() execute...");
	
	ServletActionContext.getRequest().setAttribute("name",this.getName());
	return "ok";  
  }
  
  
}
