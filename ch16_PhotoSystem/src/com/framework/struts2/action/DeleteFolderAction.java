package com.framework.struts2.action;

import com.framework.dao.FolderDao;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 刪除某一圖片資料匣 
 */
@SuppressWarnings("serial")
public class DeleteFolderAction extends ActionSupport{

  private FolderDao folderDao;
  private String folderId;
  
  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
  }

  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  
  
  
  // 主方法
  public String execute(){
  
    System.out.println("kevintest folderId = "+folderId);
    int fId = 0;
    if(!(folderId == null || folderId.equals(""))){
      fId = Integer.parseInt(folderId);
    }

    folderDao.deleteFolder(fId); // 刪除相冊
    
    
    return SUCCESS;
  } // end execute
  
  
}
