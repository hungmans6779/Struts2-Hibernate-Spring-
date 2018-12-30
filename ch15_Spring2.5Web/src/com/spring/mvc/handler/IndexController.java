package com.spring.mvc.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/*
 *  IndexController 相當於 Struts 的 Action，不同的是， IndexContext 將設定成 Spring 的一個普通 Bean，
 *  這表示處理可以充份享受 Spring IoC 和 AOP 的好處。可以將 Bean 植入到處理器中完成複雜的業務邏輯。
 *  
 *  
 *  透過擴充 Controller 接口定義處理器
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
   *  傳回一個 ModelAndView 物件( ModelAndView 包括了檢視邏輯名和著色所需的模型物件。)
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