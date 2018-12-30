package com.action;

import java.util.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DateAction extends ActionSupport {

  private Date currentDate = new Date();
  
  
  public Date getCurrentDate() {
	return currentDate;
  }


  public void setCurrentDate(Date currentDate) {
	this.currentDate = currentDate;
  }


  // ¥D¤èªk
  public String execute(){
	return Action.INPUT;  
  } // end execute()
  
}
