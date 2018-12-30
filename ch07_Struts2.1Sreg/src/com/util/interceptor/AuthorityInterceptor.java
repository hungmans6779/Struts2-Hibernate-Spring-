package com.util.interceptor;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.action.ExitAction;
import com.action.FindAllUsersAction;
import com.action.SelectInfoAction;
import com.admin.action.AddAdminAction;
import com.admin.action.DeleteAction;
import com.admin.action.DeleteAdminAction;
import com.admin.action.FindAdminAction;
import com.admin.action.FindAllAdminAction;
import com.admin.action.FindNewUsersAction;
import com.admin.action.UpdateAdminAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.user.action.UpdateAction;

/*
 *  用來判斷使用者是否已經登入
 *  
 *  如果某個 Action 指定攔截器，那麼 Web 應用在執行 Action 之前先執行相應的攔截器。
 */
public class AuthorityInterceptor extends AbstractInterceptor{

	
	
	
  // 攔截 Action 處理的攔截方法	
  @Override
  public String intercept(ActionInvocation invocation) throws Exception {
	System.out.println(AuthorityInterceptor.class.getName()+",intercept() execute()...");
	
	

	String actionName = invocation.getInvocationContext().getName();	
	String type = "";
	Object obj = invocation.getAction();
	if(obj instanceof FindAllUsersAction ){        // 檢視所有使用者或管理者
	  type = ((FindAllUsersAction)obj).getType();	
	}else if(obj instanceof SelectInfoAction){     // 檢視使用者或管理員的個人完整資訊
	  type = ((SelectInfoAction)obj).getType();		
	}else if(obj instanceof UpdateAction){         // 修改使用者個人資訊
	  type = "users";		
	}else if(obj instanceof DeleteAction){         // 刪除使用者個人資訊
	  type = "admin";	
	}else if(obj instanceof FindNewUsersAction){   // 查看新增用戶
	  type = "admin";	
	}else if(obj instanceof AddAdminAction){       // 增加管理員
	  type = "admin";	
	}else if(obj instanceof ExitAction){           // 退出系統
      type = ((ExitAction)obj).getType();		
	}else if(obj instanceof FindAllAdminAction){   // 查看所有管理者
	  type = "admin";	
	}else if(obj instanceof FindAdminAction){      // 得到某個管理員的資訊 
	  type = "admin";	
	}else if(obj instanceof UpdateAdminAction){    // 修改管理者資訊
	  type = "admin";	
	}else if(obj instanceof DeleteAdminAction){    // 刪除系統管理者
	  type = "admin";	
	}
	
	System.out.println("******************************************************************************");
	System.out.println(AuthorityInterceptor.class.getName()+",intercept()  execute...");
	System.out.println("01. actionName = "+actionName);
	System.out.println("02. type       = "+type);
	System.out.println("******************************************************************************");
	
	
	
	
	
	ActionContext ax = invocation.getInvocationContext();  // 取得請求相關的 ActionContext 實例
	Map session = ax.getSession();                         // 取得 session 物件
	
	if("admin".equals(type)){
		  
	  // 取名為 username 的 session 屬性
	  String adminname = (String)session.get("adminname");
	  System.out.println("adminname = "+adminname);
	  if(adminname!=null){
		System.out.println("《有》登入 adminname  資訊,攔截器允許通過");
		return invocation.invoke();   // 程式繼續向下執行
	   }
	   System.out.println("《無》登入 adminname 資訊，攔截器攔截該頁面！");
	   ax.put("tip","請先登入帳號");
		
	   return "adminLogin";	
    }else if("users".equals(type) || "allusers".equals(type)){
    	
	  // 取名為 username 的 session 屬性
	  String username = (String)session.get("username");
	  System.out.println("username = "+username);
	  if(username!=null){
		System.out.println("《有》登入 username 資訊,攔截器允許通過");
		return invocation.invoke();   // 程式繼續向下執行
	  }
	  System.out.println("《無》登入 username 資訊，攔截器攔截該頁面！");
	  ax.put("tip","請先登入帳號");

	  return "userLogin";	
	}else{
	  return "adminLogin";		
	}

  } // end intercept

  
	
}
