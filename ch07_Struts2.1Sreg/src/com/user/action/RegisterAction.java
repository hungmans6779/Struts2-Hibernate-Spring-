package com.user.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class RegisterAction extends ActionSupport {
	
	private String username;   // 使用者賬號
	private String password;   // 使用者密碼
	private String name;       // 使用者姓名
	private String nic;        // 使用者暱稱
	private String sex;        // 使用者性別
	private int age;          // 使用者年齡
	private String email;     // 使用者email
	private String phone;     // 使用者電話
	private String selfshow;  // 個人說明
	private String tip;       // 服務器提示的tip屬性
	
	
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

	
	
	// 註冊新的使用者
	public String register() {
	  System.out.println(RegisterAction.class.getName() + ",register()...");
      System.out.println("註冊新的使用者 username = "+username);
      this.setTip("");
      
      
	  UsersDAO userDAO = new UsersDAO();                // 產生 實體使用者 DAO 物件 
	  if(userDAO.findUsers(username)){                  // 尋找使用者是否存在
		this.setTip(this.getText("username.exist"));   // 提示資訊
		return Action.INPUT;
	  }

	  Users users = new Users();
	  users.setUsername(username);
	  users.setPassword(password);
	  users.setName(name);
	  users.setNic(nic);
	  users.setSex(sex);
	  users.setAge(age);
	  users.setEmail(email);
	  users.setPhone(phone);
	  users.setSelfshow(selfshow);
	  
	  int count = userDAO.save(users);
	  if(count > 0){  // count  > 0 表示註冊成功
		 return Action.SUCCESS;
	  }else{
		this.setTip(this.getText("register.failed")); // 提示註冊失敗資訊
		return Action.INPUT;
	  }

	} // end register()

	
	
	
}
