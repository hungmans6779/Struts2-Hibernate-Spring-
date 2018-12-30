package com.action.uploadDownfile;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MyDownloadAction extends ActionSupport {

	private String inputPath;

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	
	
	public InputStream getTargetFile() throws Exception{
	  System.out.println(MyDownloadAction.class.getName() + ",getTargetFile()...");
	  System.out.println("01.inputPath = "+inputPath);
	      
	  return ServletActionContext.getServletContext().getResourceAsStream(inputPath);	
	}
	
	// ¥D¤èªk
	public String execute() {
	  System.out.println(MyDownloadAction.class.getName() + ",execute()...");
      System.out.println("01.inputPath = "+inputPath);
      
	  return Action.SUCCESS;
	} // end execute

}
