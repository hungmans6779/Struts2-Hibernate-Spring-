package com.interceptor;

import com.listener.MyPreResultListener;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/*
 *  �d�I���G �d�I���]�w
 * 
 *    �b���e���d�I���� execute() ��k����e�M���椧���ʧ@���w�q�b�d�I���� intercept() ��k��w11
 *  �o�ˬݤW�h�{���X���c���ӲM���C���F��T�a�w�q�b execute() ��k���浲������A�B�z Result ���檺�ʧ@�A
 *  Struts2.x ���ѤF�Ω��d�I�����G����ť���A�d�I�G��ť���z�L��ʵ��U����ť���C
 */
public class BeforeResultInterceptor extends AbstractInterceptor{

  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
	// ���U��ť��
    ai.addPreResultListener(new MyPreResultListener());
    
    System.out.println(BeforeResultInterceptor.class.getName()+",intercept  execute ��k����e...");
    String result = ai.invoke();
    System.out.println(BeforeResultInterceptor.class.getName()+",intercept  execute ��k�����...");
    
    return result;
  } // end intercept

  	
}
