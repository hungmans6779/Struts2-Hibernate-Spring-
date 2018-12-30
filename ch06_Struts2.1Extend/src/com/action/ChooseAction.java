package com.action;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ChooseAction extends ActionSupport {

	// �w�q��a�y�t�ƪ��� current
	private Locale current;

	// �]�w�ثe�ϥΪ̪��y������
	public void setCurrent(Locale current) {
	  System.out.println(ChooseAction.class.getName()+",setCurrent() ...");
	  System.out.println("01. current = "+current);
	  
	  this.current = current;
	} // end setCurrent

	
	
	// �Ǧ^��a�y�t�ƪ���
	@SuppressWarnings("unchecked")
	public Map getLocales(){

	  System.out.println(ChooseAction.class.getName()+",getLocales ...");
	  System.out.println("01. current = "+current);
	  
	  Map locales = new HashMap();

	  // Ū����ڤƸ���ɡA�s���d��ȭ��� Action (ChooseAction_xx_xx.properties)
	  ResourceBundle bundle = ResourceBundle.getBundle("com.action.ChooseAction",current);

	  locales.put(bundle.getString("huizhi.en"),Locale.US);
	  locales.put(bundle.getString("huizhi.cn"),Locale.CHINA);
	  locales.put(bundle.getString("huizhi.tw"),Locale.TAIWAN);

	  
	  return locales;
	} // end  getLocales()
	
	
	
	public String execute(){
	  return Action.SUCCESS;
	}
	
	
}
