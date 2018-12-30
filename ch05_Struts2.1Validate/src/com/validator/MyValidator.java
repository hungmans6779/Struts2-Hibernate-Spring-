package com.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/*
 *  �ۭq���Ҿ�
 */
public class MyValidator extends FieldValidatorSupport {

	private String str; //  src \com\action\myValidateFile\UserMyValidatorAction-validation.xml �]�w�ɫ��w���ѼƦW str ���ȡC 

	public void validate(Object obj) throws ValidationException {
	
	  String name = super.getFieldName();                       // ���o�Q���Ҫ����W(ex.userName)
	  
	  System.out.println(MyValidator.class.getName()+",validate()......");
	  System.out.println("kevintest name  = "+ name);
	  System.out.println("kevintest value = "+ super.getFieldValue(name,obj));
	  	
	  
	  String value = super.getFieldValue(name,obj).toString();  // ���o�Q���Ҫ�����
	 
	  
	  System.out.println("01.name  = "+name);
	  System.out.println("02.value = "+value);
	  System.out.println("03.str   = "+str);
	  
	  // �Q���Ҫ��r��O�_�P���w�ȬۦP
	  if(!str.equals(value)){
		super.addFieldError(super.getFieldName(),obj); 
	  }

	} // end validate

	
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	
	
}
