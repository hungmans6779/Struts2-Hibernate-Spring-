package com.spring.bean.beanFactoryPostProcessor;

import org.springframework.beans.factory.InitializingBean;

public class Life implements InitializingBean {

	public String name;
	public Man man;

	public Life() {
		System.out.println("Spring ���͹��� Bean�GLife ���");
		System.out.println("\n");
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setMan(Man man) {
		this.man = man;
	}

	public void init(){
	  System.out.println("���b��l�Ƥ�k�Ginit()");	
	  System.out.println("\n");
	  name = "kevin";
	}
	
	/* 
	 *  ��o�� Bean ���Ҧ��ݩʳQ�]�w����A�۰ʩI�s afterPropertiesSet()  ��k�� Bean �i���l��
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() throws Exception {
      System.out.println("���b��l�Ƥ�k�GafterPropertiesSet()");
      System.out.println("\n");
	}
	
	
	
	public void doSomethings(){
	  man.eat(name);
	}

}