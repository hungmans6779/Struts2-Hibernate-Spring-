package com.spring.service.impl;

import com.spring.dao.Axe;
import com.spring.dao.impl.WoodAxe;
import com.spring.service.Person01;

public class African01 implements Person01 {


	public WoodAxe woodAxe;
	public String name;
	public int age;
	
	public African01(String name,int age,WoodAxe woodAxe){
	  this.woodAxe = woodAxe;
	  this.name = name;
	  this.age = age;
	}
	

	
	public void useAxe() {
	  System.out.println(African01.class.getName()+",useAxe() Method  execute...");
	  System.out.println(name+",年齡："+age+"歲,正在使用 "+woodAxe.chop());
	}

}
