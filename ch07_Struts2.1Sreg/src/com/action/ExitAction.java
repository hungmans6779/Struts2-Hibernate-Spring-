package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  �h�X�t��
 */
public class ExitAction extends ActionSupport {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	// �h�X
	public String exit() {
	  System.out.println(ExitAction.class.getName() + ",exit()  execute...");
      System.out.println("type = "+type);
	  
	  HttpServletRequest request = ServletActionContext.getRequest();
	  HttpSession session = request.getSession();
	  session.invalidate();

	  if("admin".equals(type)){        // �t�κ޲z��
		return "adminSuccess";  
	  }else if("users".equals(type)){  // �@��ϥΪ�
		return "userSuccess";  
	  }else{
		return "userSuccess";  
	  }

	} // end exit

	
	
}