package com.spring.service.impl;

import com.spring.service.Axe;
import com.spring.service.Person01;

/*
 *  《設值植入》的方式
 */
public class Chinese01 implements Person01 {

	private Axe axe;

	public Chinese01() {

	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}

	public void useAxe() {
      System.out.println(axe.chop());
	}

}
