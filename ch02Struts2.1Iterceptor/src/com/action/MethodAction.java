package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


public class MethodAction extends ActionSupport {

	
  public String execute(){
    System.out.println( MethodAction.class.getName()+",execute() ��k����F");
		    
	return Action.INPUT;  
  }
	
  
  public String execute1(){
    System.out.println( MethodAction.class.getName()+",execute1() ��k����F");
    
	return Action.SUCCESS;  
  }
  
  
  
  public String execute2(){
	System.out.println( MethodAction.class.getName()+",execute2() ��k����F");
	
	return Action.SUCCESS;  
  }
	   
  
  
  public String execute3(){
	System.out.println( MethodAction.class.getName()+",execute3() ��k����F");
	
	return Action.SUCCESS;  
  }
	
  
  
  public String execute4(){
	System.out.println( MethodAction.class.getName()+",execute4() ��k����F");
	
	return Action.SUCCESS;  
  }
	  
  
  
  
}
