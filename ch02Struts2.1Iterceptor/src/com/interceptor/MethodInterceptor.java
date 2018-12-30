package com.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/*
 *  攔截器方法過濾 
 *   
 *      在預設情況下，如果為某個 Action 設定攔截器，則該攔截器 Action 中的所有方法。
 *  但是，有時並不想攔截 Action 中的所有方法，而只是需要攔截其中的某幾個方法，
 *  此時就需要使用 Struts2.x 提供的攔截器方法過濾器。
 *  
 *  setExcludeMethods：設定不需要過濾的方法，所有在 executeMethods 字串中列出的方法都不會被攔截。
 *  setIncludeMethods：設定需要過濾的方法，所有在 includeMethods 字串中列出的方法都會被攔截。
 *  
 */
public class MethodInterceptor extends MethodFilterInterceptor {

	
  // 重新定義 doIntercept 方法，實現對 Action 的攔截邏輯
  @Override
  protected String doIntercept(ActionInvocation ai) throws Exception {
	System.out.println(MethodInterceptor.class.getName()+", doIntercept Method  execute...");
	System.out.println("攔截器起作用了");
	
	// 執行下一個攔截器或攔截器堆疊，或直接執行指定的Action方法
	return ai.invoke();  // 直接執行指定的 Action

  } // end  doIntercept



}
