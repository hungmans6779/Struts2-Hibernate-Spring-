package com.vo;

/*
 *  �޲z�̹��骫��
 */
public class Admin {

	private int id;            // �޲z�� ID
	private String adminname;  // �޲z���b��
	private String password;   // �޲z���K�X
	private String name;       // �޲z���u��m�W
	private int qx;           // �\�i�v(1�G���q�޲z���B2:���ź޲z�� - �֦� �W�B�R�B�� ���v��)

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
