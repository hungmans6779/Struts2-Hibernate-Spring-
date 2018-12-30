package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  退出系統
 */
public class ExitAction extends ActionSupport {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	// 退出
	public String exit() {
	  System.out.println(ExitAction.class.getName() + ",exit()  execute...");
      System.out.println("type = "+type);
	  
	  HttpServletRequest request = ServletActionContext.getRequest();
	  HttpSession session = request.getSession();
	  session.invalidate();

	  if("admin".equals(type)){        // 系統管理者
		return "adminSuccess";  
	  }else if("users".equals(type)){  // 一般使用者
		return "userSuccess";  
	  }else{
		return "userSuccess";  
	  }

	} // end exit

	
	
}