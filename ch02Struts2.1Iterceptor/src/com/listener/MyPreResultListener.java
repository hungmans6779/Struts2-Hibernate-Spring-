package com.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;


public class MyPreResultListener implements PreResultListener {

  // 實現描象方法，定義處理 Result 結果之前的行為
  public void beforeResult(ActionInvocation ai, String result) {
	
    System.out.println( MyPreResultListener.class.getName()+",攔截結果監聽器執行：傳回的檢視結果為："+result);	
    
  } // end beforeResult

	
}
