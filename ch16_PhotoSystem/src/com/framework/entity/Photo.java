package com.framework.entity;



/*
 *   �Ϥ��� photo
 */
public class Photo {
  
  private int photoId;       // �Ϥ�ID
  private String photoName;  // �Ϥ��W��
  private String photoInfo;  // �Ϥ�����
  private String photoDate;  // �Ϥ����
  private int folderId;     // ��ïID  
  
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
