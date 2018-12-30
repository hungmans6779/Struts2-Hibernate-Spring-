package com.struts2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.struts2.bean.Book;

public class BookAction extends ActionSupport{

  private String name;
  private double price;
  private int num;
  
  public String getName() {
	return name;
  }
  
  public void setName(String name) {
	this.name = name;
  }
   
  public double getPrice() {
	return price;
  }
  
  public void setPrice(double price) {
	this.price = price;
  }
  
  public int getNum() {
	return num;
  }
  
  public void setNum(int num) {
	this.num = num;
  }
  
  
  
  // ¥D¤èªk
  public String execute(){
	System.out.println(BookAction.class.getName()+",execute() Method execute...");
	
	return Action.INPUT; 
  }
  
  
  
  public String addBook(){
    System.out.println(BookAction.class.getName()+",addBook() Method execute...");
    System.out.println("name  = "+name);
    System.out.println("price = "+price);
    System.out.println("num   = "+num);
	
    return Action.SUCCESS;
  } // end addBook
  
  
  
  
}
