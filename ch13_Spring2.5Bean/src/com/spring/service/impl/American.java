package com.spring.service.impl;

import com.spring.service.Person;

public class American implements Person {

	public String sayHello(String name) {
		return name + ", Hello¡I";
	}

	public String sayGoodbye(String name) {
		return name + ", Good Bye...";
	}

}
