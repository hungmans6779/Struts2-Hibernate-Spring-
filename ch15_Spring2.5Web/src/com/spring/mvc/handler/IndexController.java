package com.spring.mvc.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/*
 *  IndexController �۷�� Struts �� Action�A���P���O�A IndexContext �N�]�w�� Spring ���@�Ӵ��q Bean�A
 *  �o��ܳB�z�i�H�R���ɨ� Spring IoC �M AOP ���n�B�C�i�H�N Bean �ӤJ��B�z���������������~���޿�C
 *  
 *  
 *  �z�L�X�R Controller ���f�w�q�B�z��
 */
public class IndexController implements Controller {

  private String sayHello;

  public String getSayHello() {
    return sayHello;
  }

  public void setSayHello(String sayHello) {
    this.sayHello = sayHello;
  }



  /*
   *  �Ǧ^�@�� ModelAndView ����( ModelAndView �]�A�F�˵��޿�W�M�ۦ�һݪ��ҫ�����C)
   *  
   *  (non-Javadoc)
   * @see org.springframework.web.servlet.mvc.Controller#handleRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) throws Exception {
    
    System.out.println(IndexController.class.getName()+",handleRequest() execute...");
    System.out.println("\n");
     
    return new ModelAndView("index","hello",sayHello);
  } // end handleRequest

  
  
}