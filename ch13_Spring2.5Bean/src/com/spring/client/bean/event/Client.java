package com.spring.client.bean.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.event.EmailEvent;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring_event.xml");
	  EmailEvent ele = new EmailEvent("kevin","hungmans6779@msn.com","您好，這是一個測試！！！");
	  ac.publishEvent(ele);
	}

}
