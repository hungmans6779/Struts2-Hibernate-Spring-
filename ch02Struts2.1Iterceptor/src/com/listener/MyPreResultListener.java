package com.listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;


public class MyPreResultListener implements PreResultListener {

  // ��{�y�H��k�A�w�q�B�z Result ���G���e���欰
  public void beforeResult(ActionInvocation ai, String result) {
	
    System.out.println( MyPreResultListener.class.getName()+",�d�I���G��ť������G�Ǧ^���˵����G���G"+result);	
    
  } // end beforeResult

	
}
