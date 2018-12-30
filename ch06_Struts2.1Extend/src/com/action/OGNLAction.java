package com.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.entity.News;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class OGNLAction extends ActionSupport implements ServletContextAware,SessionAware, ServletRequestAware {

	private ServletContext application;
	private Map session;
	private HttpServletRequest request;

	private List <News> newList;
	
	
	public void setServletContext(ServletContext application) {
      this.application = application;
	}

	public void setSession(Map<String, Object>session) {
	  this.session = session;
    }

	public void setServletRequest(HttpServletRequest request) {
      this.request = request;
	}




	// ¥D¤èªk
	public String execute() {  
	  System.out.println(OGNLAction.class.getName());	  
	  
	  application.setAttribute("userName","userName Form application");
	  session.put("userName","userName Form session");
	  request.setAttribute("userName","userName Form request");
	
	  
	  
	  
	  newList = new LinkedList<News>();
	  
	  
	  News news1 = new News();
	  news1.setNid(1);
	  news1.setNtitle("the first News Title");
	  news1.setNcontent("the first News Content");
	  news1.setNtime("2009-03-16");
	  
	  News news2 = new News();
	  news2.setNid(2);
	  news2.setNtitle("the second News Title");
	  news2.setNcontent("the second News Content");
	  news2.setNtime("2009-03-17");
	 
	  News news3 = new News();
	  news3.setNid(3);
	  news3.setNtitle("the third News Title");
	  news3.setNcontent("the third News Content");
	  news3.setNtime("2009-03-18");
	  
	  
	  newList.add(news1);
	  newList.add(news2);
	  newList.add(news3);
	  
	  
	  return Action.SUCCESS;
	} // end execute

	
	
	public List<News> getNewList() {
		return newList;
	}

	public void setNewList(List<News> newList) {
		this.newList = newList;
	}

	
	
	
}
