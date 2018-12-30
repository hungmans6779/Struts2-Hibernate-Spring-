package com.action;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
 *       �b Struts2.x Framework ���A�M���Ψ����Ҹ�ƪ���k�O validate()�C�}�o�̥i�H�z�L�~�� ActionSupport ���O�A
 *   �í��s�w�q validate() ��k�ӧ�����J���ҡC
 *   
 *       Struts2.x Framework �|�b�I�s Action ���O�� execute() ��k���e���I�s�����O�� validate() ��k�C
 * 
 *   
 *   �b Struts2.x Framework ���A���\���Ѥ@�� validateXxx() ��k�A�M������ xxx() �o�ӳB�z�޿�C
 *   �Ҧp�G���@�ӳB�z�޿謰 regist() ����k�A�b Action ���A�N�i�H�ϥ� validateRegist() ��k�����ҳo�ӳB�z�޿�C 
 *   
 *   
 *   �p�G�Q�ШD�� Action �B�z�޿��٦������� validateXxx() ���Ҥ�k�A��������Ҥ�k�N�b validate() ���Ҥ�k���e�Q����C
 * 
 * 
 * 
 *  Struts2.x ��J���Ҭy�{
 *  �z�L�W�������ЩM������Υi�H���D�AStruts2.x ������J���һݭn�g�L�H�U�X�ӨB�J�G
 *    (1)�@�i��Τ�ݪ����ҡC
 *    (2)�@��ШD���r��Ѽƶi�櫬�A�ഫ�A�ó]�w�������� Action �ݩʡC
 *    (3)�@�p�G���A�ഫ�X�{�ҥ~�A�h�N�ҥ~��T�ʸ˨� fieldError ���A�o�̤��ެO���O�����ഫ�ҥ~�A���n�i�J�U�@�B�C
 *    (4)�@�I�s Action �� validateXxx() ���Ҥ�k�A�䤤 xxx() �O�ШD Action ���������B�z�޿��k���W�١C
 *    (5)�@�I�s Action �� validate() ���Ҥ�k�C
 *    (6)�@�����W�����B�J�AFramework �}�l�ˬd�b�H�W�L�{�O�_���� fieldError�A�p�G�O�A�h�Ǧ^ input �޿��˵��A�Ϥ��A�h�Ǧ^��L�������޿��˵��C
 *    (7)�@�t�ήھڤW�@�B�J�Ǧ^���޿��˵��W�e�{�����������˵��C 
 * 
 */
public class ValidateAction2 extends ActionSupport {

	private String username;  // �m�W
	private String passwd;    // �K�X

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	
	// �������
	public void validate() {
	  System.out.println(ValidateAction2.class.getName()+",validate()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
	   
	  if(username != null && !Pattern.matches("\\w{5,15}",username.trim())){
    	addFieldError("username","�ϥΪ̩m�W���פ��ŦX�n�D ...");  
      }else{
    	if(!"kevin".equals(username)){
    	  addFieldError("username","�ϥΪ̩m�W���~�I�I�I");  	
    	}
      }
	  
	  if(passwd != null && !Pattern.matches("\\d{3,20}",passwd.trim())){
		addFieldError("passwd","�ϥΪ̱K�X���פ��ŦX�n�D ...");  
	  }else{
		if(!"1234".equals(passwd)){
	      addFieldError("passwd","�ϥΪ̱K�X���~�I�I�I");  	
	    }  
	  }
	} // end validateLogin()
	
	
	
	
	
	
	
	// �������
	public void validateLogin() {
	  System.out.println(ValidateAction2.class.getName()+",validateLogin()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
	   
	  if(username != null && !Pattern.matches("\\w{5,15}",username.trim())){
    	addFieldError("username","�ϥΪ̩m�W���פ��ŦX�n�D ...");  
      }else{
    	if(!"kevin".equals(username)){
    	  addFieldError("username","�ϥΪ̩m�W���~�I�I�I");  	
    	}
      }
	  
	  if(passwd != null && !Pattern.matches("\\d{3,20}",passwd.trim())){
		addFieldError("passwd","�ϥΪ̱K�X���פ��ŦX�n�D ...");  
	  }else{
		if(!"1234".equals(passwd)){
	      addFieldError("passwd","�ϥΪ̱K�X���~�I�I�I");  	
	    }  
	  }
	} // end validateLogin()
	
	
	
	
	
	// �n�J��k
	public String login(){
	  System.out.println(ValidateAction2.class.getName()+",login()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
		  
	  return Action.SUCCESS;
	} // end login()

	
	
	
}
