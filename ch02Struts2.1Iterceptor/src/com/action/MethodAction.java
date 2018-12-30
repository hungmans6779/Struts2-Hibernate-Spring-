package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class MethodAction extends ActionSupport {

	
  public String execute(){
    System.out.println( MethodAction.class.getName()+",execute() 方法執行了");
		    
	return Action.INPUT;  
  }
	
  
  public String execute1(){
    System.out.println( MethodAction.class.getName()+",execute1() 方法執行了");
    
	return Action.SUCCESS;  
  }
  
  
  
  public String execute2(){
	System.out.println( MethodAction.class.getName()+",execute2() 方法執行了");
	
	return Action.SUCCESS;  
  }
	   
  
  
  public String execute3(){
	System.out.println( MethodAction.class.getName()+",execute3() 方法執行了");
	
	return Action.SUCCESS;  
  }
	
  
  
  public String execute4(){
	System.out.println( MethodAction.class.getName()+",execute4() 方法執行了");
	
	return Action.SUCCESS;  
  }
	  
  
  
  
}
