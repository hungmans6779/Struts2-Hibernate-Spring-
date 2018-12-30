package com.spring.client.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.bean.autowire.Building01;

public class Client01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  ApplicationContext ac = new FileSystemXmlApplicationContext("src\\spring-autowire.xml");
	  Building01 build01 = (Building01) ac.getBean("build01");
	  build01.out();
	} // end main

}
