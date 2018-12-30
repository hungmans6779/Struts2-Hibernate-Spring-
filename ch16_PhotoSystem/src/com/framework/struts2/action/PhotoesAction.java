package com.framework.struts2.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.framework.dao.PhotoDao;
import com.framework.entity.Photo;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class PhotoesAction extends ActionSupport {

  private FolderDao folderDao;   //  DAO
  private PhotoDao photoDao;     //  DAO
 
  private int totalPage;
  private int pageNumber;
  private int pageSize;
  private int folderId;
  private List<Photo> folderPhotoes;


  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
  }

  public PhotoDao getPhotoDao() {
    return photoDao;
  }

  public void setPhotoDao(PhotoDao photoDao) {
    this.photoDao = photoDao;
  }

  public int getTotalPage() {
    return totalPage;
  }

  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public int getFolderId() {
    return folderId;
  }

  public void setFolderId(int folderId) {
    this.folderId = folderId;
  }

  public List<Photo> getFolderPhotoes() {
    return folderPhotoes;
  }

  public void setFolderPhotoes(List<Photo> folderPhotoes) {
    this.folderPhotoes = folderPhotoes;
  }



  
  
  
  
  
  /*
   * 
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */  
  public String execute(){
    
    HttpServletRequest request = ServletActionContext.getRequest();
    String fId = request.getParameter("folderId");
    this.folderId = Integer.parseInt(fId);
    
    int picAmount = photoDao.picNum(folderId); // 琩高ㄏノ琘い瓜计秖 
    
    String pageNumberStr = request.getParameter("pageNumber");
    if(pageNumberStr == null || "".equals(pageNumberStr.trim())){
      pageNumberStr = "1"; 
    }
    pageSize = 1;
    
    int [] paging = new int[2];
    paging = photoDao.pageNumber(picAmount,pageNumberStr,pageSize);   // だ肚ヘ玡计㎝羆计
    pageNumber = paging[0];
    totalPage = paging[1];
    
    System.out.println("************************************************************");
    System.out.println(PhotoesAction.class.getName()+",execute().....");
    System.out.println("01. folderId      = "+folderId);
    System.out.println("02. picAmount     = "+picAmount);
    System.out.println("03. pageNumberStr = "+pageNumberStr);
    System.out.println("04. pageSize      = "+pageSize);
    System.out.println("05. pageNumber    = "+pageNumber);
    System.out.println("06. totalPage     = "+totalPage);
    System.out.println("************************************************************");

    folderPhotoes = photoDao.folderPic(folderId,pageNumber,pageSize);  // 琩高琘┮Τ瓜
    
   
    return SUCCESS;
  } // end execute();
  
  
  
  
  
}
