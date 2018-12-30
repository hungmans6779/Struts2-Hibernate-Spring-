package com.spring.bean.autowire;

public class Man01 {

	public String name;
	public int age;
	public String sex;

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void out() {
		System.out.println("\n");
		System.out.println(Man01.class.getName() + ",out() execute...");
		System.out.println("name = " + name);
		System.out.println("age  = " + age);
		System.out.println("sex  = " + sex);
	}
	
	
}
