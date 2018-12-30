package com.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;


/*
 *       在 Struts2.x Framework 中，專門用來驗證資料的方法是 validate()。開發者可以透過繼承 ActionSupport 類別，
 *   並重新定義 validate() 方法來完成輸入驗證。
 *   
 *       Struts2.x Framework 會在呼叫 Action 類別的 execute() 方法之前先呼叫該類別的 validate() 方法。
 * 
 *   
 *    在 validate() 方法中發現有不合法輸入時，會呼叫其父類別的 addFieldError() 方法，記錄一個 fieldError 錯誤。當流程進入到 execute() 方法之前，
 *  系統檢查有沒有 fieldError，如果有，則不再執行 execute() 方法，而是傳回一個 input 邏輯檢視。所以，如果 validate() 方法中檢測到輸入錯誤，
 *  只需將錯誤紀錄下來即可，Struts2.x Framework 在呼叫業務邏輯之前會得知這個錯誤，這樣就可以完成驗證功能。  
 * 
 * 
 * 
 *  Struts2.x 輸入驗證流程
 *  透過上面的介紹和實例應用可以知道，Struts2.x 完成輸入驗證需要經過以下幾個步驟：
 *    (1)　進行用戶端的驗證。
 *    (2)　對請求的字串參數進行型態轉換，並設定為對應的 Action 屬性。
 *    (3)　如果型態轉換出現例外，則將例外資訊封裝到 fieldError 中，這裡不管是不是產生轉換例外，都要進入下一步。
 *    (4)　呼叫 Action 的 validateXxx() 驗證方法，其中 xxx() 是請求 Action 中對應的處理邏輯方法的名稱。
 *    (5)　呼叫 Action 的 validate() 驗證方法。
 *    (6)　完成上面的步驟，Framework 開始檢查在以上過程是否產生 fieldError，如果是，則傳回 input 邏輯檢視，反之，則傳回其他相應的邏輯檢視。
 *    (7)　系統根據上一步驟傳回的邏輯檢視名呈現相應的實體檢視。 
 *    
 */
public class ValidateAction extends ActionSupport {

	private String username;  // 姓名
	private String passwd;    // 密碼

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

	
	
	
	// 資料驗證
	public void validate() {
	  System.out.println(ValidateAction.class.getName()+",validate()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
	  
	  if(username == null || username.length() <= 4 || username.length() >= 15 ){
    	addFieldError("username","使用者姓名長度不符合要求 ...");  
      }else{
    	if(!"kevin".equals(username)){
    	  addFieldError("username","使用者姓名錯誤！！！");  	
    	}
      }
	  
	  if(passwd == null || passwd.length() <= 3 || passwd.length() >= 20){
		addFieldError("passwd","使用者密碼長度不符合要求 ...");  
	  }else{
		if(!"1234".equals(passwd)){
	      addFieldError("passwd","使用者密碼錯誤！！！");  	
	    }  
	  }
	} // end validate()
	
	
	
	
	
	// 主方法
	public String execute(){
	  System.out.println(ValidateAction.class.getName()+",execute()");
	  System.out.println("01.username = "+username);
	  System.out.println("02.passwd   = "+passwd);
		  
	  return Action.SUCCESS;
	} // end execute()

	
	
	
}
