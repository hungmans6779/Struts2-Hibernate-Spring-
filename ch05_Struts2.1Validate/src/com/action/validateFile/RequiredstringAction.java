package com.action.validateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  �ϥΤ������Ҿ��G
 *  �ݭn�b�@���ɮ�(�]�٬������ɮ�) ���]�w�A�o�̸ӳ]�w�ɪ��W�٬� RequiredstringAction-validation.xml�C
 *  
 *  
 *      �����ɮת��R�W�W�h�G<ActionName>-validation.xml�A�Ҧp�W�z��Ҫ� Action �٬� RequiredstringAction (���]�t���O���]�W)�A
 *  �h�������������Ҿ����]�w�ɦW�٬�  RequiredstringAction-validation.xml �C
 *  
 */
public class RequiredstringAction extends ActionSupport {

	private String name;  // �m�W
	private String pass;  // �K�X

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	
	// �D��k
	public String execute(){
	  System.out.println(RequiredstringAction.class.getName()+",execute()...");
	  System.out.println("01.name = "+name);
	  System.out.println("02.pass = "+pass);
	  
	  return Action.SUCCESS;
	} // end execute()
	
	
}
