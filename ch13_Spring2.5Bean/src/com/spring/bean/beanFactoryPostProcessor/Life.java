package com.spring.bean.beanFactoryPostProcessor;

import org.springframework.beans.factory.InitializingBean;

public class Life implements InitializingBean {

	public String name;
	public Man man;

	public Life() {
		System.out.println("Spring 產生實體 Bean：Life 實例");
		System.out.println("\n");
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setMan(Man man) {
		this.man = man;
	}

	public void init(){
	  System.out.println("正在初始化方法：init()");	
	  System.out.println("\n");
	  name = "kevin";
	}
	
	/* 
	 *  當這個 Bean 的所有屬性被設定完後，自動呼叫 afterPropertiesSet()  方法對 Bean 進行初始化
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
      System.out.println("正在初始化方法：afterPropertiesSet()");
      System.out.println("\n");
	}
	
	
	
	public void doSomethings(){
	  man.eat(name);
	}

}