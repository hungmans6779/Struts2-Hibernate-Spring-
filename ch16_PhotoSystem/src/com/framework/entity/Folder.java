package com.framework.entity;

/*
 *  �ۥU�� folder
 */
public class Folder {
  
  private int folderId;       // ��ïID
  private String folderName;  // ��ï�W
  private String folderInfo;  // ��ï����
  private int userId;         // �ϥΪ�ID

  
  public int getFolderId() {
    return folderId;
  }

  public void setFolderId(int folderId) {
    this.folderId = folderId;
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

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }


}
