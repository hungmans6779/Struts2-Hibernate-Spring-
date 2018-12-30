package com.framework.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.framework.entity.Folder;
import com.opensymphony.xwork2.ActionSupport;

public class FolderNameAction extends ActionSupport {

  private FolderDao folderDao;               // 相冊表 DAO
  private List<Folder> allFoldersName;

  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
  }

  public List<Folder> getAllFoldersName() {
    return allFoldersName;
  }

  public void setAllFoldersName(List<Folder> allFoldersName) {
    this.allFoldersName = allFoldersName;
  }

  
  
  @Override
  public String execute() throws Exception {
    
    HttpServletRequest request  = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    
    int userId = (Integer)session.getAttribute("userId");
    
    System.out.println("*************************************************");
    System.out.println(FolderNameAction.class.getName()+",execute() Method  execute...");
    System.out.println("01. userId = "+userId);
    
    this.allFoldersName = folderDao.allFolders(userId);  // 該使用者的所有的相冊
    
    
    return SUCCESS;
  } // execute

  

  
  

}
