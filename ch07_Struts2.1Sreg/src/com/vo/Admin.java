package com.vo;

/*
 *  管理者實體物件
 */
public class Admin {

	private int id;            // 管理員 ID
	private String adminname;  // 管理員帳號
	private String password;   // 管理員密碼
	private String name;       // 管理員真實姓名
	private int qx;           // 許可權(1：普通管理員、2:高級管理員 - 擁有 增、刪、改 等權限)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminname() {
		return adminname;
	}

	public void setAdminname(String adminname) {
		this.adminname = adminname;
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

	public int getQx() {
		return qx;
	}

	public void setQx(int qx) {
		this.qx = qx;
	}

}
