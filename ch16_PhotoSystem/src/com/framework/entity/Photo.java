package com.framework.entity;



/*
 *   圖片表 photo
 */
public class Photo {
  
  private int photoId;       // 圖片ID
  private String photoName;  // 圖片名稱
  private String photoInfo;  // 圖片說明
  private String photoDate;  // 圖片日期
  private int folderId;     // 相簿ID  
  
  public int getPhotoId() {
    return photoId;
  }

  public void setPhotoId(int photoId) {
    this.photoId = photoId;
  }

  public String getPhotoName() {
    return photoName;
  }

  public void setPhotoName(String photoName) {
    this.photoName = photoName;
  }

  public String getPhotoInfo() {
    return photoInfo;
  }

  public void setPhotoInfo(String photoInfo) {
    this.photoInfo = photoInfo;
  }

  public String getPhotoDate() {
    return photoDate;
  }

  public void setPhotoDate(String photoDate) {
    this.photoDate = photoDate;
  }

  public int getFolderId() {
    return folderId;
  }

  public void setFolderId(int folderId) {
    this.folderId = folderId;
  }

}
