package com.struts2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  �s�� ActionConext
 *      �bStruts2.x ���AAction �w�P Servlet API ���������A�o�ϱo Struts2.x �� Action �㦳��[�F���M�C���X���S�ʡA
 *  �P Struts1.x �ۤ�O�ӥ��j���i�B�C���M Struts2.x �� Action �w�g�P Servlet API ���������A���b��{�~���޿�B�z�ɡA
 *  �g�`�ݭn�s�� Servlet ��������A�Ҧp session�Brequest �P application ���CStruts2.x ���Ѥ@�ӦW�٬� ActionContext �����O�A
 *  �b Action ���i�H�z�L�����O��o Servlet API �C 
 * 
 */
public class LoginAction extends ActionSupport{

  private String username;
  private String password;
  
  public String getUsername() {
	return username;
  }
  
  public void setUsername(String username) {
	this.username = username;
  }
  
  public String getPassword() {
	return password;
  }
  
  public void setPassword(String password) {
	this.password = password;
  }
  
 
  
  
  // �n�J����
  public String checkLogin(){
	
	System.out.println(LoginAction.class.getName()+",checkLogin() execute.....");  
	System.out.println("01.username = "+username);
	System.out.println("02.password = "+password);
	
	
	// ��o ActionContext
	ActionContext ac = ActionContext.getContext();
	ac.getApplication().put("username",this.username);
	ac.getSession().put("username",this.username);
	
	
	if("kevin".equalsIgnoreCase(username) && "1234".equals(password)){
	   return Action.SUCCESS;
	}else{
	   return Action.INPUT;	
	}

  } // end checkLogin
  
  
  
}
