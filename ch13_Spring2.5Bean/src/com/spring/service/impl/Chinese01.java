package com.spring.service.impl;

import com.spring.dao.Axe;
import com.spring.service.Person01;

public class Chinese01 implements Person01 {

	public Axe axe;

	public String name;
	public int age;
	
	public Chinese01(String name,int age){
	  this.name = name;
	  this.age = age;
	}
	
	public Axe getAxe() {
		return axe;
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	
	
	public void useAxe() {
	  System.out.println(Chinese01.class.getName()+",useAxe() Method  execute...");
	  System.out.println(name+",年齡："+age+"歲,正在使用 "+axe.chop());
	}

	
}
