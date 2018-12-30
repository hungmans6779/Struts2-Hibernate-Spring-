package com.interceptor;

import com.action.PublicAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;


/*
 *  ��r�L�o�d�I��
 *  
 *  ���W���ǽ׾­n�D�|���o�������e����a��ż�ܡA�p�G�|���o���ɨϥΤ������y���A
 *  �b�q�`���p�U�A�t�η|�۰ʥH"*"�Ӵ��N�o��ż�r�C�b Struts2.x �i�H�ϥ��d�I���ӹ�{�o�ӥ\��C
 *  �Ҧp�����s�D�Q�o�G�A���̥ͭi�H���i��ۥѸԽסA�����F�L����ФH�A�n�D���̥ͭ�������λy�A
 *  �p�G�X�{������ԭz�A�ݭn�t�ι�{���r���L�o�C
 * 
 */
@SuppressWarnings("serial")
public class ContentInterceptor extends AbstractInterceptor{

  @Override
  public String intercept(ActionInvocation ai) throws Exception {
	
    Object object = ai.getAction();
    if(object != null){
      if(object instanceof PublicAction){
    	PublicAction action = (PublicAction)object;
    	String content = action.getContent();
    	if(content.contains("��")){ 
    	   content = content.replaceAll("��"," * ");
    	   action.setContent(content);
    	} 	  
    	return ai.invoke(); 
      }else{
    	return Action.SUCCESS;  
      }
    }else{
      return Action.SUCCESS;	
    }    
  } // end intercept


}
