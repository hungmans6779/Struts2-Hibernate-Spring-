package com.spring.service.impl;

import com.spring.service.Person;

public class Chinese implements Person {

	public String sayHello(String name) {
		return name + ", 您好！";
	}

	public String sayGoodbye(String name) {
		return name + ", 下次再見...";
	}

}
