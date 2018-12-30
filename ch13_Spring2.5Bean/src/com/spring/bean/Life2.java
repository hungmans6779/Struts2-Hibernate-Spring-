package com.spring.bean;

import java.util.Date;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/*
 *  參閱活動圖
 *  (1) BeanFactory 中 Bean 的生命週期;
 *  (2) ApplicationContext 中 Bean 的生命週期;
 */
public class Life2 implements InitializingBean,DisposableBean{

  public String msg = null;
  public Date date = null;
	  

  /*
   * (non-Javadoc)
   * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
   * 
   * 當這個 Bean 的所有屬性被 Spring 的 BeanFactory 設定完後，會自動呼叫 afterPropertiesSet() 方法對 Bean 進行初始化，
   * 於是設定檔不用指定 init-method 屬性了。
   */
  public void afterPropertiesSet() throws Exception {
	System.out.println(Life2.class.getName()+" ,afterPropertiesSet() method  execute...");
    msg = "Perfect Life！";
	date = new Date();		
  } // end  afterPropertiesSet() 


 
  public void doLife(){
	System.out.println(Life2.class.getName()+" ,doLife() method  execute...");
	System.out.println("Todate is ："+date);
	System.out.println(msg);
  } // end doLife()


  
  /*
   * 如果 Bean 實現了 DisposableBean 介面，那麼 Spring 將自動呼叫 Bean 的 destroy() 方法進行銷毀，
   * 所以，在 Bean 中實現了 DisposableBean 介面的同時，必需實現該介面的 destroy() 方法。  
   */
  public void destroy() throws Exception {
	System.out.println(Life2.class.getName()+" ,destroy() method  execute...");
	msg = null;
	date = null;
  } // end destroy()
	  
	  
  	
  
}
