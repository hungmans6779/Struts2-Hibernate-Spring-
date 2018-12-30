package com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  攔截器順序，攔截器設定
 *  
 *      如果在同一個系統中設定多個攔截器，根據設定攔截器的順序不同，執行攔截器的順序也不一樣。
 *  通常認為，先設定的攔截器會先獲得執行機會，但實際情況不是這樣.....。
 *  
 */
public class OrderByInterceptor extends AbstractInterceptor {

  private String name;
		
  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }


  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
	System.out.println(OrderByInterceptor.class.getName()+",intercept() Method execute...");
	
	System.out.println(name+" 攔截器執行： 登入 Action...");
	
	String result = ai.invoke();
	
	System.out.println("result = "+result);
	
	System.out.println(name+" 攔截器執行完畢...\n");
	
	return result;
  
  } // end intercept

 	
}
