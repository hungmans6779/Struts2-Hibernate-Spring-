package com.spring.mvc.handler.upload;

import org.springframework.web.multipart.MultipartFile;


/* 
 *  表單物件
 */
public class UploadBean {

  private MultipartFile attach; // 上傳檔案屬性
  private String description;   // 檔案描述
  String filename;               // 檔案名

  public MultipartFile getAttach() {
    return attach;
  }

  public void setAttach(MultipartFile attach) {
    this.attach = attach;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }



}
