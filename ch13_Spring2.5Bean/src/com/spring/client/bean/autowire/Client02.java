package com.spring.client.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.autowire.Building02;

public class Client02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring-autowire.xml");
		Building02 build02 = (Building02) ac.getBean("build02");
		build02.out();
	} // end main

}
