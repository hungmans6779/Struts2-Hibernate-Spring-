package com.action.validateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class StringlengthAction extends ActionSupport {

	private String userName;  // �m�W
    private int age;          // �~��
    private String birthday;  // �X�ͤ��
    private String pass;      // �п�J�K�X
    private String rpass;     // �ЦA��J�@���K�X
    private String email;     // �H�c
    private String url;       // ���}
    
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		this.rpass = rpass;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	// �D��k
	public String execute() {
	  System.out.println(StringlengthAction.class.getName()+",execute()...");
	  System.out.println("01. userName = "+userName);
	  System.out.println("02. age      = "+age);
	  System.out.println("03. birthday = "+birthday);
	  System.out.println("04. pass     = "+pass);
	  System.out.println("05. rpass    = "+rpass);
	  System.out.println("06. email    = "+email);
	  System.out.println("07. url      = "+url);
	  
	  return Action.SUCCESS;
	
	} // end

	
}
