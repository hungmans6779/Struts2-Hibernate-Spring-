package com.action;

import com.opensymphony.xwork2.Action;

import com.opensymphony.xwork2.ActionSupport;

public class DoubleselectAction extends ActionSupport {

	private String city;
	private String area;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
	// ¥D¤èªk
	public String execute() {
	  System.out.println(DoubleselectAction.class.getName() + ",execute()");
	  System.out.println("city = "+city);
	  System.out.println("area = "+area);
		
	  if( (city==null || city.equals(""))  && (area==null || area.equals(""))){
		return Action.INPUT;
	  }else{
		return Action.SUCCESS;  
	  }
	  
	} // end execute()

}
