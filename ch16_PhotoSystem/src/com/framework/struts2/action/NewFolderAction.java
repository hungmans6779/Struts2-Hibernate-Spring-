package com.framework.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.framework.dao.FolderDao;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class NewFolderAction extends ActionSupport {

  private FolderDao folderDao;
  private String folderName;
  private String folderInfo;
  
  
  public FolderDao getFolderDao() {
    return folderDao;
  }

  public void setFolderDao(FolderDao folderDao) {
    this.folderDao = folderDao;
  }

  public String getFolderName() {
    return folderName;
  }

  public void setFolderName(String folderName) {
    this.folderName = folderName;
  }

  public String getFolderInfo() {
    return folderInfo;
  }

  public void setFolderInfo(String folderInfo) {
    this.folderInfo = folderInfo;
  }

  
  
  
  
  
  
  
  
  @Override
  public void validate() {
    HttpServletRequest request = ServletActionContext.getRequest();
    HttpSession session = request.getSession();
    
    int userId = session.getAttribute("userId") != null?(Integer)session.getAttribute("userId"):0;

    
    System.out.println("******************************************************************************************************");
    System.out.println(NewFolderAction.class.getName()+", validate() Method execute...");
    System.out.println("01.userId     = "+userId);
    System.out.println("02.folderName = "+folderName);
    System.out.println("03.folderInfo = "+folderInfo);
    System.out.println("******************************************************************************************************");
   
    if(userId == 0){
      this.addFieldError("doc","���n�J�I");
    }else if(folderName == null){
      this.addFieldError("doc","��ï�W�٪ŭ�");
    }else if(folderInfo == null){
      this.addFieldError("doc","��ï�����ŭ�");
    }else{}
    
    
    int i = folderDao.saveFolder(folderName,folderInfo,userId);  // �W�[�ۥU��T
    if(i == 0){
      this.addFieldError("doc","�إߥ��ѡI");
    }else{
      this.addFieldError("doc","�إߦ��\�I");
    }
    
  } // end validate()

  
  
  
  
  
  
  /*
   * �D�\��
   * 
   * (non-Javadoc)
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */ 
  @Override
  public String execute() throws Exception {
    return SUCCESS;
  } // end execute()
  
  
  
  
  
  
  
  
  
  
}
