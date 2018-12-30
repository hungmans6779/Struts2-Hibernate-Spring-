package com.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/*
 *  �d�I����k�L�o 
 *   
 *      �b�w�]���p�U�A�p�G���Y�� Action �]�w�d�I���A�h���d�I�� Action �����Ҧ���k�C
 *  ���O�A���ɨä��Q�d�I Action �����Ҧ���k�A�ӥu�O�ݭn�d�I�䤤���Y�X�Ӥ�k�A
 *  ���ɴN�ݭn�ϥ� Struts2.x ���Ѫ��d�I����k�L�o���C
 *  
 *  setExcludeMethods�G�]�w���ݭn�L�o����k�A�Ҧ��b executeMethods �r�ꤤ�C�X����k�����|�Q�d�I�C
 *  setIncludeMethods�G�]�w�ݭn�L�o����k�A�Ҧ��b includeMethods �r�ꤤ�C�X����k���|�Q�d�I�C
 *  
 */
public class MethodInterceptor extends MethodFilterInterceptor {

	
  // ���s�w�q doIntercept ��k�A��{�� Action ���d�I�޿�
  @Override
  protected String doIntercept(ActionInvocation ai) throws Exception {
	System.out.println(MethodInterceptor.class.getName()+", doIntercept Method  execute...");
	System.out.println("�d�I���_�@�ΤF");
	
	// ����U�@���d�I�����d�I�����|�A�Ϊ���������w��Action��k
	return ai.invoke();  // ����������w�� Action

  } // end  doIntercept



}
