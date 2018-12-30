package com.framework.struts2.action;

import com.framework.dao.FolderDao;
import com.opensymphony.xwork2.ActionSupport;


/*
 * �R���Y�@�Ϥ���ƧX 
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

  
  
  
  // �D��k
  public String execute(){
  
    System.out.println("kevintest folderId = "+folderId);
    int fId = 0;
    if(!(folderId == null || folderId.equals(""))){
      fId = Integer.parseInt(folderId);
    }

    folderDao.deleteFolder(fId); // �R���ۥU
    
    
    return SUCCESS;
  } // end execute
  
  
}
