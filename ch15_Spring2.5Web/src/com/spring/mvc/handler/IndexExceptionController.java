package com.spring.mvc.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexExceptionController implements Controller {

  
  private String sayHello;

  public String getSayHello() {
    return sayHello;
  }

  public void setSayHello(String sayHello) {
    this.sayHello = sayHello;
  }

  
  
  public ModelAndView handleRequest(HttpServletRequest request,HttpServletResponse response) {
  
    System.out.println(IndexExceptionController.class.getName()+",handleRequest() execute...");
    System.out.println("\n");
    
    int i=0/0;   
    
    return new ModelAndView("index","hello",sayHello);
  }
  

}
