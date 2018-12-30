package com.spring.bean.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/*
 *  �e����ť�����O
 */
public class EmailNotifier implements ApplicationListener {

	/*
	 * ��{ ApplicationListener ����������{����k�A�Ӥ�k�|�b�e���o�ͨƥ�ɦ۰�Ĳ�o 
	 * (non-Javadoc)
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ApplicationEvent event) {
      if(event instanceof EmailEvent){
        EmailEvent emailEvent = (EmailEvent)event;
        System.out.println(EmailNotifier.class.getName()+",onApplicationEvent() execute...");
        System.out.println("�ݭn�o�e�l�󪺱�����}�G"+emailEvent.address);
        System.out.println("�ݭn�o�e�l�󪺶l�󥿤�G"+emailEvent.text);
        System.out.println("\n");
      }else{
    	System.out.println("�e���������ƥ�G"+event);  
    	System.out.println("\n");
      }
	} // end onApplicationEvent

	
}
