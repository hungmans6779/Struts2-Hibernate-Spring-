package com.spring.bean.autowire;

public class Building02 {
	public String name;
	public int age;
	public Man man;

	public Building02(Man man) {
		this.man = man;
	}

	public Building02(){	
	}
	
	
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

	
	public void out() {
		System.out.println("\n");
		System.out.println(Building02.class.getName()+",out() execute...");
		System.out.println(name);
		System.out.println(age);
		man.out();
	}
}
