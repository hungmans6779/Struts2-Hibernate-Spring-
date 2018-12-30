package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *       �b Struts2.x Framework ���A�M���Ψ����Ҹ�ƪ���k�O validate()�C�}�o�̥i�H�z�L�~�� ActionSupport ���O�A
 *   �í��s�w�q validate() ��k�ӧ�����J���ҡC
 *   
 *       Struts2.x Framework �|�b�I�s Action ���O�� execute() ��k���e���I�s�����O�� validate() ��k�C
 * 
 *   
 *    �b validate() ��k���o�{�����X�k��J�ɡA�|�I�s������O�� addFieldError() ��k�A�O���@�� fieldError ���~�C��y�{�i�J�� execute() ��k���e�A
 *  �t���ˬd���S�� fieldError�A�p�G���A�h���A���� execute() ��k�A�ӬO�Ǧ^�@�� input �޿��˵��C�ҥH�A�p�G validate() ��k���˴����J���~�A
 *  �u�ݱN���~�����U�ӧY�i�AStruts2.x Framework �b�I�s�~���޿褧�e�|�o���o�ӿ��~�A�o�˴N�i�H�������ҥ\��C  
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
public class ValidateAction extends ActionSupport {

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
	  System.out.println(ValidateAction.class.getName()+",validate()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
	  
	  if(username == null || username.length() <= 4 || username.length() >= 15 ){
    	addFieldError("username","�ϥΪ̩m�W���פ��ŦX�n�D ...");  
      }else{
    	if(!"kevin".equals(username)){
    	  addFieldError("username","�ϥΪ̩m�W���~�I�I�I");  	
    	}
      }
	  
	  if(passwd == null || passwd.length() <= 3 || passwd.length() >= 20){
		addFieldError("passwd","�ϥΪ̱K�X���פ��ŦX�n�D ...");  
	  }else{
		if(!"1234".equals(passwd)){
	      addFieldError("passwd","�ϥΪ̱K�X���~�I�I�I");  	
	    }  
	  }
	} // end validate()
	
	
	
	
	
	// �D��k
	public String execute(){
	  System.out.println(ValidateAction.class.getName()+",execute()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
		  
	  return Action.SUCCESS;
	} // end execute()

	
	
	
}
