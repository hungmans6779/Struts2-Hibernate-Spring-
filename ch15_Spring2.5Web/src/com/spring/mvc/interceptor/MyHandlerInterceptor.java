package com.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


/*
 *  �B�z�����d�I��
 *  
 *  Spring ���B�z���M�g�䴩�d�I���A��Q���Y�ǽШD���ѯS��\��ɡA�N�i�H�ϥΥ��̨ϥγB�z���M�g�����d�I���A
 *  ������{ org.springframework.web.servlet �]���� HandlerInterceptor �����C
 */
public class MyHandlerInterceptor implements HandlerInterceptor{

  
  
  /*
   *  �b�B�z������e�I�s
   *  
   *  @return boolean �A�Q�γo�@�I�A�i�H�վ� HandlerExecutionChain ������欰�C
   *  ���Ǭ� true �ɡA�B�z��������N�~�����U�h;
   *  ���Ǭ� false �ɡA DispatcherServlet �N�{���ШD�w�g�Q�B�z�����A���A�~����� HandlerExecutionChain ������L�B�z���M�d�I���C
   *  
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
   */
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    
    System.out.println(MyHandlerInterceptor.class.getName()+",���� preHandle() ��k");
    System.out.println("\n");
    
    return true;
  }

  
  
  
  
  
  
  /*
   *  �b�B�z�������I�s
   * 
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
   */
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,ModelAndView modelandview) throws Exception {
  
    System.out.println(MyHandlerInterceptor.class.getName()+",���� postHandle() ��k");
    System.out.println("\n");
    
  } // end postHandle
  
  
  
  
  
  

  
  /*
   *  �b��ӽШD�B�z����I�s
   *  
   * (non-Javadoc)
   * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
   */
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,Exception ex) throws Exception {
    
    System.out.println(MyHandlerInterceptor.class.getName()+",���� afterCompletion() ��k");
  
    System.out.println("ex�G"+ex.toString());
  
    
    System.out.println("\n");
    
  } // end afterCompletion


  
  

  
  
}
