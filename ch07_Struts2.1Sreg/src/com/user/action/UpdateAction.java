package com.user.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class UpdateAction extends ActionSupport {
	
	private int id;           // 使用者id
	private String username;  // 使用者賬號
	private String password;  // 使用者密碼
	private String name;      // 使用者姓名
	private String nic;       // 使用者暱稱
	private String sex;       // 使用者性別
	private int age;          // 使用者年齡
	private String email;     // 使用者email
	private String phone;     // 使用者電話
	private String selfshow;  // 個人說明
	private String tip;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSelfshow() {
		return selfshow;
	}

	public void setSelfshow(String selfshow) {
		this.selfshow = selfshow;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	
	
	// 修改使用者個人資訊
	public String update(){
	  System.out.println(UpdateAction.class.getName()+",update() execute...");
		
	  HttpSession session = ServletActionContext.getRequest().getSession(true);
	  String logingUsername = (String)session.getAttribute("username");	
	  System.out.println("登入的使用表帳號 logingUsername = "+logingUsername);

	  if(!logingUsername.equals(username)){  // 修改資訊人員與該登入的使用者帳號不同
		this.setTip(this.getText("update.failed"));  
		return Action.INPUT; 
	  }
	  
	  
      Users users = new Users();
      users.setId(id);
	  users.setUsername(username);
	  users.setPassword(password);
	  users.setName(name);
	  users.setNic(nic);
	  users.setSex(sex);
	  users.setAge(age);
	  users.setEmail(email);
	  users.setPhone(phone);
	  users.setSelfshow(selfshow);
		
      UsersDAO userDAO = new UsersDAO();  // 產生使用者 DAO 實體物件
      
	  int i = userDAO.update(users);      // 修改個人資訊
	  if(i > 0){
		return Action.SUCCESS;  
	  }else{
		this.setTip(this.getText("update.failed"));  
		return Action.INPUT;
	  }
	} // end update()

	
}
