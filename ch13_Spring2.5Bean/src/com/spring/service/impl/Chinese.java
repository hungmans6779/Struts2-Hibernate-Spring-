package com.spring.service.impl;

import com.spring.service.Person;

public class Chinese implements Person {

	public String sayHello(String name) {
		return name + ", �z�n�I";
	}

	public String sayGoodbye(String name) {
		return name + ", �U���A��...";
	}

}
