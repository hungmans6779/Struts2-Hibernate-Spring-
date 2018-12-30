package com.interceptor;

import com.action.PublicAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/*
 *  文字過濾攔截器
 *  
 *  網上有些論壇要求會員發帖的內容不能帶有髒話，如果會員發帖時使用不雅的語言，
 *  在通常情況下，系統會自動以"*"來替代這些髒字。在 Struts2.x 可以使用攔截器來實現這個功能。
 *  例如有條新聞被發佈，網友們可以對其進行自由詳論，但為了尊重原創人，要求網友們必須文明用語，
 *  如果出現不文明敘述，需要系統實現對文字的過濾。
 * 
 */
@SuppressWarnings("serial")
public class ContentInterceptor extends AbstractInterceptor{

  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
    Object object = ai.getAction();
    if(object != null){
      if(object instanceof PublicAction){
    	PublicAction action = (PublicAction)object;
    	String content = action.getContent();
    	if(content.contains("不")){ 
    	   content = content.replaceAll("不"," * ");
    	   action.setContent(content);
    	} 	  
    	return ai.invoke(); 
      }else{
    	return Action.SUCCESS;  
      }
    }else{
      return Action.SUCCESS;	
    }    
  } // end intercept


}
