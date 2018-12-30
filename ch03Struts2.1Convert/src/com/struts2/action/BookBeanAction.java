package com.struts2.action;

import com.opensymphony.xwork2.Action;
import com.struts2.bean.Book;

public class BookBeanAction {
	
  private Book book;

  public Book getBook() {
	return book;
  }

  public void setBook(Book book) {
	this.book = book;
  }
  
  
  
  // ¥D¤èªk
  public String execute(){
	System.out.println(BookBeanAction.class.getName()+",execute() Method execute...");
	
	return Action.INPUT; 
  }
  
  
  
  public String addBook(){
    System.out.println(BookBeanAction.class.getName()+",addBook() Method execute...");
    System.out.println("name  = "+book.getName());
    System.out.println("price = "+book.getPrice());
    System.out.println("num   = "+book.getNum());
	
    return Action.SUCCESS;
  } // end addBook
  
	  
}
