package com.spring.mvc.handler.tiles;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class AboutController implements Controller {

  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
    // return new ModelAndView("tiles/about");//傳回一個ModelAndView物件
    return new ModelAndView("about");//傳回一個ModelAndView物件
    
  }

  
}
