package com.action.validateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class StringlengthAction extends ActionSupport {

	private String userName;  // 姓名
    private int age;          // 年齡
    private String birthday;  // 出生日期
    private String pass;      // 請輸入密碼
    private String rpass;     // 請再輸入一次密碼
    private String email;     // 信箱
    private String url;       // 網址
    
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

	// 主方法
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
