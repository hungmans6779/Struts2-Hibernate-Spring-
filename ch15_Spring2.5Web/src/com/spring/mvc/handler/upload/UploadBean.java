package com.spring.mvc.handler.upload;

import org.springframework.web.multipart.MultipartFile;


/* 
 *  ��檫��
 */
public class UploadBean {

  private MultipartFile attach; // �W���ɮ��ݩ�
  private String description;   // �ɮ״y�z
  String filename;               // �ɮצW

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
