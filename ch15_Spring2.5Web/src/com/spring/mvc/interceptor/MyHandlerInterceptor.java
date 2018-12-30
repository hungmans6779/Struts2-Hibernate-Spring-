package com.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/*
 *  處理器的攔截器
 *  
 *  Spring 的處理器映射支援攔截器，當想為某些請求提供特殊功能時，就可以使用它們使用處理器映射中的攔截器，
 *  必須實現 org.springframework.web.servlet 包中的 HandlerInterceptor 介面。
 */
public class MyHandlerInterceptor implements HandlerInterceptor{

  
  
  /*
   *  在處理器執行前呼叫
   *  
   *  @return boolean ，利用這一點，可以調整 HandlerExecutionChain 的執行行為。
   *  當它傳為 true 時，處理器執行鏈將繼續執行下去;
   *  當它傳為 false 時， DispatcherServlet 將認為請求已經被處理完成，不再繼續執行 HandlerExecutionChain 中的其他處理器和攔截器。
   *  
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
   */
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    
    System.out.println(MyHandlerInterceptor.class.getName()+",執行 preHandle() 方法");
    System.out.println("\n");
    
    return true;
  }

  
  
  
  
  
  
  /*
   *  在處理器執行後呼叫
   * 
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
   */
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelandview) throws Exception {
  
    System.out.println(MyHandlerInterceptor.class.getName()+",執行 postHandle() 方法");
    System.out.println("\n");
    
  } // end postHandle
  
  
  
  
  
  

  
  /*
   *  在整個請求處理完後呼叫
   *  
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
   */
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception ex) throws Exception {
    
    System.out.println(MyHandlerInterceptor.class.getName()+",執行 afterCompletion() 方法");
  
    System.out.println("ex："+ex.toString());
  
    
    System.out.println("\n");
    
  } // end afterCompletion


  
  

  
  
}
