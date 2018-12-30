package com.framework.entity;

/*
 *  相冊表 folder
 */
public class Folder {
  
  private int folderId;       // 相簿ID
  private String folderName;  // 相簿名
  private String folderInfo;  // 相簿說明
  private int userId;         // 使用者ID

  
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
