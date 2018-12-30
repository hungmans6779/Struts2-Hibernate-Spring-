package com.spring.bean.propertyPlaceholderConfigurer;

public class DB {

	public String driverClassName;
	public String url;
	public String username;
	public String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	public void out(){
	  System.out.println(DB.class.getName()+",out() execute...");
	  System.out.println("driverClassName = "+driverClassName);	
	  System.out.println("url             = "+url);
	  System.out.println("username        = "+username);
	  System.out.println("password        = "+password);
	}
	

}
