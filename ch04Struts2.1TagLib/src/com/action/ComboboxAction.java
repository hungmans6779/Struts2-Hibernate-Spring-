package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ComboboxAction extends ActionSupport {

	private String books1;
	private String books2;

	public String getBooks1() {
		return books1;
	}

	public void setBooks1(String books1) {
		this.books1 = books1;
	}

	public String getBooks2() {
		return books2;
	}

	public void setBooks2(String books2) {
		this.books2 = books2;
	}

	
	// ¥D¤èªk
	public String execute(){
	  System.out.println(ComboboxAction.class.getName());
	  System.out.println("books1 = "+books1);
	  System.out.println("books2 = "+books2);
	  
	  if((books1.equals("") || books1==null) && ((books2.equals("") || books2==null) )){
	    return Action.INPUT;
	  }else{
		return Action.SUCCESS; 
	  }
	  
	}
	
}
