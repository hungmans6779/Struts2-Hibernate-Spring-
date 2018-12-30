package com.spring.client.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.autowire.Building03;

public class Client03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring-autowire.xml");
		Building03 build03 = (Building03) ac.getBean("build03");
		build03.out();
	}

}
