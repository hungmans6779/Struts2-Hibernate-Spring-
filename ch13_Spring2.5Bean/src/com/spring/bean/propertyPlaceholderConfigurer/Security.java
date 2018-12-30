package com.spring.bean.propertyPlaceholderConfigurer;

public class Security {

	public String driverClassName_1;
	public String url_1;
	public String username_1;
	public String password_1;
	public String driverClassName_2;
	public String url_2;
	public String username_2;
	public String password_2;

	public String getDriverClassName_1() {
		return driverClassName_1;
	}

	public void setDriverClassName_1(String driverClassName_1) {
		this.driverClassName_1 = driverClassName_1;
	}

	public String getUrl_1() {
		return url_1;
	}

	public void setUrl_1(String url_1) {
		this.url_1 = url_1;
	}

	public String getUsername_1() {
		return username_1;
	}

	public void setUsername_1(String username_1) {
		this.username_1 = username_1;
	}

	public String getPassword_1() {
		return password_1;
	}

	public void setPassword_1(String password_1) {
		this.password_1 = password_1;
	}

	public String getDriverClassName_2() {
		return driverClassName_2;
	}

	public void setDriverClassName_2(String driverClassName_2) {
		this.driverClassName_2 = driverClassName_2;
	}

	public String getUrl_2() {
		return url_2;
	}

	public void setUrl_2(String url_2) {
		this.url_2 = url_2;
	}

	public String getUsername_2() {
		return username_2;
	}

	public void setUsername_2(String username_2) {
		this.username_2 = username_2;
	}

	public String getPassword_2() {
		return password_2;
	}

	public void setPassword_2(String password_2) {
		this.password_2 = password_2;
	}

	
	
	
	
	public void out() {
	    System.out.println(Security.class.getName()+",out() execute...");
		System.out.println("driverClassName_1 = " + driverClassName_1);
		System.out.println("url_1             = " + url_1);
		System.out.println("username_1        = " + username_1);
		System.out.println("password_1        = " + password_1);
		System.out.println("\n");
		
		System.out.println("driverClassName_2 = " + driverClassName_2);
		System.out.println("url_2             = " + url_2);
		System.out.println("username_2        = " + username_2);
		System.out.println("password_2        = " + password_2);
	} // end out

}
