package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SelectAction extends ActionSupport {

	private String books1;
	private String books2;
	private String books3;

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

	public String getBooks3() {
		return books3;
	}

	public void setBooks3(String books3) {
		this.books3 = books3;
	}

	
	
	// ¥D¤èªk
	public String execute(){
	  System.out.println(SelectAction.class.getName()+",execute()......");
	  System.out.println("books1 = "+books1);
	  System.out.println("books2 = "+books2);
	  System.out.println("books3 = "+books3);
	  
	  
	  if( (books1==null || books1.equals(""))  && (books2==null || books2.equals(""))  && (books3==null || books3.equals("")) ){
		return Action.INPUT; 
	  }else{
		return Action.SUCCESS;  
	  }
	} // end execute()
 	
	
}
