package com.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  使用者登入攔截器
 *  
 *  功能：實現判斷使用者是否登入的攔截器
 */
public class LoginInterceptor extends AbstractInterceptor{

	
  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	 
	// 獲得 session 物件  
	Map session = ai.getInvocationContext().getSession();
	ActionContext application = ai.getInvocationContext();
	application.put("popedom","");
	
    // 獲得SESSION 中的 user ，給予值給 username 屬性	
	String username = (String)session.get("username");

	System.out.println(LoginInterceptor.class.getName()+",execute()......");
	System.out.println("username = "+username);
	
	
	
	
	if(username !=null && username.length() > 0){ // 如果 Session 中存在 user，則進行後續操作
      System.out.println("Session 中存在 user，則進行後續操作");
		
      System.out.println("ddddd");
      
	  return ai.invoke();	
	}else{                                        // 否則，即沒有 user 物件，表示使用者還沒有登入
	  System.out.println("即沒有 user 物件，表示使用者還沒有登入");
		
	 
	  application.put("popedom","您還沒有登入，請登入！");
	  	  
	  return "globalLogin";		
	} 
	
  } // end intercept

  
}
