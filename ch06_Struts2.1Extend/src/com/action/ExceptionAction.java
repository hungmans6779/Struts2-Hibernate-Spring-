package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ExceptionAction extends ActionSupport {

	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	
	// °£¥H
	public String jisuan() throws Exception {
	  System.out.println(ExceptionAction.class.getName()+",jisuan()...");
	  System.out.println("01. a = "+a);
	  System.out.println("02. b = "+b);
	  System.out.println("03. c = "+c);
	  
	  
      c = a/b;
      return Action.SUCCESS;
	}
	
	

}
