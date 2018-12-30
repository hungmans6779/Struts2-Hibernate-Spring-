package com.action;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class DatetimepickerAction extends ActionSupport {

	private String birthday;
	private String recordtime;

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRecordtime() {
		return recordtime;
	}

	public void setRecordtime(String recordtime) {
		this.recordtime = recordtime;
	}
	
	
	// ¥D¤èªk
	public String execute(){
		
	  System.out.println(DatetimepickerAction.class.getName() + ",execute()");
	  System.out.println("birthday   = "+birthday);
	  System.out.println("recordtime = "+recordtime);
		  
	  if( (birthday == null || "".equals(birthday))  &&  (recordtime == null || "".equals(recordtime)) ){
		 return Action.INPUT;
	  }else{
		 return Action.SUCCESS; 
	  }
	} // end execute()

}
