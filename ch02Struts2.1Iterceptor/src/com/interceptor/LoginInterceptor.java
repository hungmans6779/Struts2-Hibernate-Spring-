package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  �ϥΪ̵n�J�d�I��
 *  
 *  �\��G��{�P�_�ϥΪ̬O�_�n�J���d�I��
 */
public class LoginInterceptor extends AbstractInterceptor{

	
  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	 
	// ��o session ����  
	Map session = ai.getInvocationContext().getSession();
	ActionContext application = ai.getInvocationContext();
	application.put("popedom","");
	
    // ��oSESSION ���� user �A�����ȵ� username �ݩ�	
	String username = (String)session.get("username");

	System.out.println(LoginInterceptor.class.getName()+",execute()......");
	System.out.println("username = "+username);
	
	
	
	
	if(username !=null && username.length() > 0){ // �p�G Session ���s�b user�A�h�i�����ާ@
      System.out.println("Session ���s�b user�A�h�i�����ާ@");
		
      System.out.println("ddddd");
      
	  return ai.invoke();	
	}else{                                        // �_�h�A�Y�S�� user ����A��ܨϥΪ��٨S���n�J
	  System.out.println("�Y�S�� user ����A��ܨϥΪ��٨S���n�J");
		
	 
	  application.put("popedom","�z�٨S���n�J�A�еn�J�I");
	  	  
	  return "globalLogin";		
	} 
	
  } // end intercept

  
}
