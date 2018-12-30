package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  �d�I�����ǡA�d�I���]�w
 *  
 *      �p�G�b�P�@�Өt�Τ��]�w�h���d�I���A�ھڳ]�w�d�I�������Ǥ��P�A�����d�I�������Ǥ]���@�ˡC
 *  �q�`�{���A���]�w���d�I���|����o������|�A����ڱ��p���O�o��.....�C
 *  
 */
public class OrderByInterceptor extends AbstractInterceptor {

  private String name;
		
  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }


  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
	System.out.println(OrderByInterceptor.class.getName()+",intercept() Method execute...");
	
	System.out.println(name+" �d�I������G �n�J Action...");
	
	String result = ai.invoke();
	
	System.out.println("result = "+result);
	
	System.out.println(name+" �d�I�����槹��...\n");
	
	return result;
  
  } // end intercept

 	
}
