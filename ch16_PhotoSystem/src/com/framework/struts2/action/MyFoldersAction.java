package com.framework.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.framework.dao.PhotoDao;
import com.framework.entity.Folder;
import com.framework.entity.Photo;

public class MyFoldersAction {

  private FolderDao folderDao;
  private List<Folder> allFolders;
  
  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
  }

  public List<Folder> getAllFolders() {
    return allFolders;
  }

  public void setAllFolders(List<Folder> allFolders) {
    this.allFolders = allFolders;
  }


  
  
  /*
   * 主功能
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */  
  public String execute(){
    
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    int userId = (Integer)session.getAttribute("userId");
    
    System.out.println("**********************************************");
    System.out.println(MyFoldersAction.class.getName());
    System.out.println("01.userId = "+userId);
    System.out.println("**********************************************");

    this.allFolders = folderDao.allFolders(userId);  // 該使用者的所有的相冊
    
    return "success";
  } // end execute
  
  
  
  
  
  

}
