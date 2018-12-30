package com.interceptor;

import com.listener.MyPreResultListener;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  攔截結果 攔截器設定
 * 
 *    在之前的攔截器中 execute() 方法執行前和執行之的動作都定義在攔截器的 intercept() 方法中w11
 *  這樣看上去程式碼結構不太清晰。為了精確地定義在 execute() 方法執行結束之後再處理 Result 執行的動作，
 *  Struts2.x 提供了用於攔截器結果的監聽器，攔截果監聽器透過手動註冊給監聽器。
 */
public class BeforeResultInterceptor extends AbstractInterceptor{

  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
	// 註冊監聽器
    ai.addPreResultListener(new MyPreResultListener());
    
    System.out.println(BeforeResultInterceptor.class.getName()+",intercept  execute 方法執行前...");
    String result = ai.invoke();
    System.out.println(BeforeResultInterceptor.class.getName()+",intercept  execute 方法執行後...");
    
    return result;
  } // end intercept

  	
}
