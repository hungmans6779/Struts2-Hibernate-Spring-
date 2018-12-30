package com.action.validateFile;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *  使用內建驗證器：
 *  需要在一個檔案(也稱為驗證檔案) 中設定，這裡該設定檔的名稱為 RequiredstringAction-validation.xml。
 *  
 *  
 *      驗證檔案的命名規則：<ActionName>-validation.xml，例如上述實例的 Action 稱為 RequiredstringAction (不包含類別的包名)，
 *  則對應的內建驗證器的設定檔名稱為  RequiredstringAction-validation.xml 。
 *  
 */
public class RequiredstringAction extends ActionSupport {

	private String name;  // 姓名
	private String pass;  // 密碼

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

	
	// 主方法
	public String execute(){
	  System.out.println(RequiredstringAction.class.getName()+",execute()...");
	  System.out.println("01.name = "+name);
	  System.out.println("02.pass = "+pass);
	  
	  return Action.SUCCESS;
	} // end execute()
	
	
}
