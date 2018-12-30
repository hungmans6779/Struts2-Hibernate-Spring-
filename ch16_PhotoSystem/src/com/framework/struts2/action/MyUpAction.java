package com.framework.struts2.action;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.aspectj.util.FileUtil;

import com.framework.dao.PhotoDao;
import com.opensymphony.xwork2.ActionSupport;


@SuppressWarnings("serial")
public class MyUpAction extends ActionSupport {

  private File doc;                // �ʸˤW���ɮת��ݩ�
  private String docContentType;   // �ʸˤW���ɮת������ݩ�
  private String docFileName;      // �ʸˤW���ɮת��W���ݩ�

  private String targetFileName;   // �x�s�ɮצW���ݩ�
  private String dir;              // �x�s�۸��|�ݩ�

  private String photoInfo;        // �Ϥ�����
  private String tip;

  private PhotoDao photoDao; // �ۤ��� DAO



  public File getDoc() {
    return doc;
  }

  public void setDoc(File doc) {
    this.doc = doc;
  }

  public String getDocContentType() {
    return docContentType;
  }

  public void setDocContentType(String docContentType) {
    this.docContentType = docContentType;
  }

  public String getDocFileName() {
    return docFileName;
  }

  public void setDocFileName(String docFileName) {
    this.docFileName = docFileName;
  }

  public String getTargetFileName() {
    return targetFileName;
  }

  public void setTargetFileName(String targetFileName) {
    this.targetFileName = targetFileName;
  }

  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public String getPhotoInfo() {
    return photoInfo;
  }

  public void setPhotoInfo(String photoInfo) {
    this.photoInfo = photoInfo;
  }

  public String getTip() {
    return tip;
  }

  public void setTip(String tip) {
    this.tip = tip;
  }

  public PhotoDao getPhotoDao() {
    return photoDao;
  }

  public void setPhotoDao(PhotoDao photoDao) {
    this.photoDao = photoDao;
  }



  // ���ɮצ۰ʤ��t�ɮצW�١A�קK����
  private String generateFileName(String docFileName) {
    DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");  // �]�m��ܮ榡
    String formatDate = format.format(new Date());               // ��o�ثe�ɶ��A�ë��Ӥ@�w���榡�ഫ���r��

    int random = new Random().nextInt(10000);                    // �H�������ɮ׽s��
    int position = docFileName.lastIndexOf(".");                  // ��o�ɮ׫��W
    String extension = docFileName.substring(position);           // �I���ɮ׫��W
    String newfileName = formatDate + random + extension;         // �զ��@�ӷs���ɮצW��

    System.out.println("***********************************************************************");
    System.out.println(MyUpAction.class.getName() + ",generateFileName Method execute...");
    System.out.println("01. docFileName = " + docFileName);
    System.out.println("02  formatDate  = " + formatDate);
    System.out.println("03. random      = " + random);
    System.out.println("04. position    = " + position);
    System.out.println("05. extension   = " + extension);
    System.out.println("06. newfileName = " + newfileName);
    System.out.println("***********************************************************************");


    return newfileName;
  } // end generateFileName


  
  
  
  
  
  
  

  /*
   * �D�\��
   * 
   * (non-Javadoc)
   * 
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  @Override
  public String execute() throws Exception {

    HttpServletRequest request = ServletActionContext.getRequest();
    String realPath = request.getRealPath("/upload"); // ��o upload ���|����ڥؿ�
    String targetDirectory = realPath;

    if ((docFileName == null) || "".equals(docFileName.trim())) {
      this.addFieldError("doc", "�ɮפ��ର�šI");
    } else {
      targetFileName = generateFileName(docFileName);         // �����x�s�ɮת��ɮצW��
      setDir(targetDirectory + "\\" + targetFileName);        // �x�s�ɮת����|
      File target = new File(targetDirectory,targetFileName); // �إߤ@�ӥؼ��ɮ�

      try {
        FileUtil.copyFile(doc,target); // �N�{���ɮ׽ƻs��ؼ��ɮ�
      } catch (Exception e) {
        e.printStackTrace();
      }


      String fId = request.getParameter("folderId");
      int folderId = Integer.parseInt(fId);
      int photoId = photoDao.savePhoto(targetFileName,photoInfo,folderId); // �x�s�Ϥ�

      System.out.println("*********************************************************************");
      System.out.println(MyUpAction.class.getName() + ",execute() Method execute....");
      System.out.println("01.realPath        = " + realPath);
      System.out.println("02.targetDirectory = " + targetDirectory);
      System.out.println("03.targetFileName  = " + targetFileName);
      System.out.println("04.folderId        = " + folderId);
      System.out.println("05.photoId         = " + photoId);
      System.out.println("*********************************************************************");

      if (photoId > 0) {
        this.addFieldError("doc", "�W�Ǧ��\�I");
      } else {
        this.addFieldError("doc", "�W�ǥ��ѡI");
      }

    } // end execute...

    return SUCCESS;
  } // end execute



}
