package com.spring.bean.autowire;

public class Building01 {

	public String name;
	public int age;
	public Man man;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	
	
	
	public void out() {
		System.out.println("\n");
		System.out.println(Building01.class.getName()+",out() execute...");
		System.out.println(name);
		System.out.println(age);
		man.out();
	}
}
