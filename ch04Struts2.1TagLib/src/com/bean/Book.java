package com.bean;

public class Book {

	private String name;   // �ѦW
	private String price;  // ����

	public Book() {
	}

	public Book(String name,String price){
	this.name = name;
	this.price = price;
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
