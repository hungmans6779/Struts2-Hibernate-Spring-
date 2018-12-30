package com.framework.struts2.action;

import com.framework.dao.PhotoDao;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 刪除某一張圖片
 */
@SuppressWarnings("serial")
public class DeletePicAction extends ActionSupport{
  
  private PhotoDao photoDao;
  private String folderId;
  private String photoId;
  
  
  public PhotoDao getPhotoDao() {
    return photoDao;
  }

  public void setPhotoDao(PhotoDao photoDao) {
    this.photoDao = photoDao;
  }
  
  public String getFolderId() {
    return folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public String getPhotoId() {
    return photoId;
  }

  public void setPhotoId(String photoId) {
    this.photoId = photoId;
  }

  // 主方法
  public String execute(){
    
    int fId = (!(folderId == null || "".equals(folderId)))?Integer.parseInt(folderId):0; 
    int pId = (!(photoId == null || "".equals(photoId)))?Integer.parseInt(photoId):0;
      
    if(fId!= 0 && pId!=0){
      photoDao.deletePic(fId,pId); // 刪除資料表中的圖片資訊
    }
    
    
    return SUCCESS;
  } // end execute
  
  
  
}
