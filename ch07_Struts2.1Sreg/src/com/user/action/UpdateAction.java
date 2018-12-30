package com.user.action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.UsersDAO;
import com.vo.Users;

public class UpdateAction extends ActionSupport {
	
	private int id;           // �ϥΪ�id
	private String username;  // �ϥΪ̽㸹
	private String password;  // �ϥΪ̱K�X
	private String name;      // �ϥΪ̩m�W
	private String nic;       // �ϥΪ̼ʺ�
	private String sex;       // �ϥΪ̩ʧO
	private int age;          // �ϥΪ̦~��
	private String email;     // �ϥΪ�email
	private String phone;     // �ϥΪ̹q��
	private String selfshow;  // �ӤH����
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

	
	
	// �ק�ϥΪ̭ӤH��T
	public String update(){
	  System.out.println(UpdateAction.class.getName()+",update() execute...");
		
	  HttpSession session = ServletActionContext.getRequest().getSession(true);
	  String logingUsername = (String)session.getAttribute("username");	
	  System.out.println("�n�J���ϥΪ�b�� logingUsername = "+logingUsername);

	  if(!logingUsername.equals(username)){  // �ק��T�H���P�ӵn�J���ϥΪ̱b�����P
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
		
      UsersDAO userDAO = new UsersDAO();  // ���ͨϥΪ� DAO ���骫��
      
	  int i = userDAO.update(users);      // �ק�ӤH��T
	  if(i > 0){
		return Action.SUCCESS;  
	  }else{
		this.setTip(this.getText("update.failed"));  
		return Action.INPUT;
	  }
	} // end update()

	
}
