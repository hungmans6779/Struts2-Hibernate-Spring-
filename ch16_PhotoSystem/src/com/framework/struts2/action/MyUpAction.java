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

  private File doc;                // 封裝上傳檔案的屬性
  private String docContentType;   // 封裝上傳檔案的類型屬性
  private String docFileName;      // 封裝上傳檔案的名稱屬性

  private String targetFileName;   // 儲存檔案名稱屬性
  private String dir;              // 儲存相路徑屬性

  private String photoInfo;        // 圖片說明
  private String tip;

  private PhotoDao photoDao; // 相片表 DAO



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



  // 為檔案自動分配檔案名稱，避免重複
  private String generateFileName(String docFileName) {
    DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");  // 設置顯示格式
    String formatDate = format.format(new Date());               // 獲得目前時間，並按照一定的格式轉換為字串

    int random = new Random().nextInt(10000);                    // 隨機產生檔案編號
    int position = docFileName.lastIndexOf(".");                  // 獲得檔案後綴名
    String extension = docFileName.substring(position);           // 截取檔案後綴名
    String newfileName = formatDate + random + extension;         // 組成一個新的檔案名稱

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
   * 主功能
   * 
   * (non-Javadoc)
   * 
   * @see com.opensymphony.xwork2.ActionSupport#execute()
   */
  @Override
  public String execute() throws Exception {

    HttpServletRequest request = ServletActionContext.getRequest();
    String realPath = request.getRealPath("/upload"); // 獲得 upload 路徑的實際目錄
    String targetDirectory = realPath;

    if ((docFileName == null) || "".equals(docFileName.trim())) {
      this.addFieldError("doc", "檔案不能為空！");
    } else {
      targetFileName = generateFileName(docFileName);         // 產生儲存檔案的檔案名稱
      setDir(targetDirectory + "\\" + targetFileName);        // 儲存檔案的路徑
      File target = new File(targetDirectory,targetFileName); // 建立一個目標檔案

      try {
        FileUtil.copyFile(doc,target); // 將臨時檔案複製到目標檔案
      } catch (Exception e) {
        e.printStackTrace();
      }


      String fId = request.getParameter("folderId");
      int folderId = Integer.parseInt(fId);
      int photoId = photoDao.savePhoto(targetFileName,photoInfo,folderId); // 儲存圖片

      System.out.println("*********************************************************************");
      System.out.println(MyUpAction.class.getName() + ",execute() Method execute....");
      System.out.println("01.realPath        = " + realPath);
      System.out.println("02.targetDirectory = " + targetDirectory);
      System.out.println("03.targetFileName  = " + targetFileName);
      System.out.println("04.folderId        = " + folderId);
      System.out.println("05.photoId         = " + photoId);
      System.out.println("*********************************************************************");

      if (photoId > 0) {
        this.addFieldError("doc", "上傳成功！");
      } else {
        this.addFieldError("doc", "上傳失敗！");
      }

    } // end execute...

    return SUCCESS;
  } // end execute



}
