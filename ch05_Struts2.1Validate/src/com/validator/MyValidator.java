package com.validator;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/*
 *  自訂驗證器
 */
public class MyValidator extends FieldValidatorSupport {

	private String str; //  src \com\action\myValidateFile\UserMyValidatorAction-validation.xml 設定檔指定的參數名 str 的值。 

	public void validate(Object obj) throws ValidationException {
	
	  String name = super.getFieldName();                       // 取得被驗證的欄位名(ex.userName)
	  
	  System.out.println(MyValidator.class.getName()+",validate()......");
	  System.out.println("kevintest name  = "+ name);
	  System.out.println("kevintest value = "+ super.getFieldValue(name,obj));
	  	
	  
	  String value = super.getFieldValue(name,obj).toString();  // 取得被驗證的欄位值
	 
	  
	  System.out.println("01.name  = "+name);
	  System.out.println("02.value = "+value);
	  System.out.println("03.str   = "+str);
	  
	  // 被驗證的字串是否與指定值相同
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
