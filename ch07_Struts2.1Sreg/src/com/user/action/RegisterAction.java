package com.user.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class RegisterAction extends ActionSupport {
	
	private String username;   // �ϥΪ̽㸹
	private String password;   // �ϥΪ̱K�X
	private String name;       // �ϥΪ̩m�W
	private String nic;        // �ϥΪ̼ʺ�
	private String sex;        // �ϥΪ̩ʧO
	private int age;          // �ϥΪ̦~��
	private String email;     // �ϥΪ�email
	private String phone;     // �ϥΪ̹q��
	private String selfshow;  // �ӤH����
	private String tip;       // �A�Ⱦ����ܪ�tip�ݩ�
	
	
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

	
	
	// ���U�s���ϥΪ�
	public String register() {
	  System.out.println(RegisterAction.class.getName() + ",register()...");
      System.out.println("���U�s���ϥΪ� username = "+username);
      this.setTip("");
      
      
	  UsersDAO userDAO = new UsersDAO();                // ���� ����ϥΪ� DAO ���� 
	  if(userDAO.findUsers(username)){                  // �M��ϥΪ̬O�_�s�b
		this.setTip(this.getText("username.exist"));   // ���ܸ�T
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
	  if(count > 0){  // count  > 0 ��ܵ��U���\
		 return Action.SUCCESS;
	  }else{
		this.setTip(this.getText("register.failed")); // ���ܵ��U���Ѹ�T
		return Action.INPUT;
	  }

	} // end register()

	
	
	
}
