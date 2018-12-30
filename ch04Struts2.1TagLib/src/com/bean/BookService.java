package com.bean;

/*
 *  定義 BookService 類別
 */
public class BookService {

  // 傳回 Book 集合物件	
  public Book [] getBooks(){
	  
	return new Book[]{
	  new Book("SSH從入門到精通","68"),
	  new Book("Struts 2完全學習手冊","55"),
	  new Book("Ajax完全學習手冊","38")
	};
	
  } // end getBooks()
  
}
