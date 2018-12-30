package com.spring.bean.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/*
 *  容器監聽器類別
 */
public class EmailNotifier implements ApplicationListener {

	/*
	 * 實現 ApplicationListener 介面必須實現的方法，該方法會在容器發生事件時自動觸發 
	 * (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ApplicationEvent event) {
      if(event instanceof EmailEvent){
        EmailEvent emailEvent = (EmailEvent)event;
        System.out.println(EmailNotifier.class.getName()+",onApplicationEvent() execute...");
        System.out.println("需要發送郵件的接收位址："+emailEvent.address);
        System.out.println("需要發送郵件的郵件正文："+emailEvent.text);
        System.out.println("\n");
      }else{
    	System.out.println("容器本身的事件："+event);  
    	System.out.println("\n");
      }
	} // end onApplicationEvent

	
}
