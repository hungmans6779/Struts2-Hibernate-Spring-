package com.struts2.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.struts2.bean.Book;

public class BookListAction {
 
  private List<Book> bookList = new ArrayList();

  public List<Book> getBookList() {
	return bookList;
  }

  public void setBookList(List<Book> bookList) {
	this.bookList = bookList;
  }
  
  
  // ¥D¤èªk
  public String execute(){
	System.out.println(BookListAction.class.getName()+",execute() Method execute...");
	
	return Action.INPUT; 
  }
  
  
  
  public String addBook(){
    System.out.println(BookListAction.class.getName()+",addBook() Method execute...");

    Iterator itBook = bookList.iterator();
    Book book = null;
    while(itBook.hasNext()){
      book = (Book)itBook.next();
      System.out.println("name  = "+book.getName());
      System.out.println("price = "+book.getPrice());
      System.out.println("num   = "+book.getNum());	
    } // end while(itBook.hasNext()){

    
    return Action.SUCCESS;
  } // end addBook
  
	  
  
}
