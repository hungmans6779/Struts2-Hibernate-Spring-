package com.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 *  �Ѿ\���ʹ�
 *  (1) BeanFactory �� Bean ���ͩR�g��;
 *  (2) ApplicationContext �� Bean ���ͩR�g��;
 */
public class Life2 implements InitializingBean,DisposableBean{

  public String msg = null;
  public Date date = null;
	  

  /*
   * (non-Javadoc)
   * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
   * 
   * ��o�� Bean ���Ҧ��ݩʳQ Spring �� BeanFactory �]�w����A�|�۰ʩI�s afterPropertiesSet() ��k�� Bean �i���l�ơA
   * ��O�]�w�ɤ��Ϋ��w init-method �ݩʤF�C
   */
  public void afterPropertiesSet() throws Exception {
	System.out.println(Life2.class.getName()+" ,afterPropertiesSet() method  execute...");
    msg = "Perfect Life�I";
	date = new Date();		
  } // end  afterPropertiesSet() 


 
  public void doLife(){
	System.out.println(Life2.class.getName()+" ,doLife() method  execute...");
	System.out.println("Todate is �G"+date);
	System.out.println(msg);
  } // end doLife()


  
  /*
   * �p�G Bean ��{�F DisposableBean �����A���� Spring �N�۰ʩI�s Bean �� destroy() ��k�i��P���A
   * �ҥH�A�b Bean ����{�F DisposableBean �������P�ɡA���ݹ�{�Ӥ����� destroy() ��k�C  
   */
  public void destroy() throws Exception {
	System.out.println(Life2.class.getName()+" ,destroy() method  execute...");
	msg = null;
	date = null;
  } // end destroy()
	  
	  
  	
  
}
