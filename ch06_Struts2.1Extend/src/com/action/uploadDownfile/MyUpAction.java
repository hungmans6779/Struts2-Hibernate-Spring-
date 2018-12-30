package com.action.uploadDownfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
       《檔案上傳》：在 Struts2.x 中實現檔案上傳，需要註冊一個"上傳解析器"，開啟 struts.properties 設定檔，可以看到解析器的註冊程式碼。
                   如果表單中包含一個 name 屬性為 xxx 的檔案域，那麼在 Action 中可以使用如下3個屬性來封裝檔案域資訊：
                   File xxx             ：封裝檔案域對應的檔案內容;
                   String xxxFileName   ：封裝上傳檔案的檔案名稱; 
                   String xxxContentType：封裝上傳的檔案型態；                  
 */
@SuppressWarnings("serial")
public class MyUpAction extends ActionSupport {

	private File upload;              // 封裝上傳檔案域的屬性
	private String uploadContentType; // 封裝上傳檔案的型態
	private String uploadFileName;    // 封裝上傳檔案名
	private String savePath;          // 封裝檔案上傳的儲存路徑

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	
	@SuppressWarnings("deprecation")
	public String getSavePath() {
		return ServletActionContext.getRequest().getRealPath(savePath);
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	
	
	// 主方法
	public String execute() {
		
	  String fileName = getSavePath()+"\\"+getUploadFileName();
		 
	  System.out.println(MyUpAction.class.getName() + ",execute()...");
	  System.out.println("01. upload            = "+upload);
	  System.out.println("02. uploadContentType = "+uploadContentType);
	  System.out.println("03. uploadFileName    = "+uploadFileName);
	  System.out.println("04. savePath          = "+savePath);
	  System.out.println("**************************************************");
	  System.out.println("01. fileName          = "+fileName);
	  
	  try{
	   
	    FileOutputStream fos = new FileOutputStream(fileName);
	    FileInputStream fis  = new FileInputStream(getUpload());
	    
	    byte [] b = new byte[1024];
	    int len = 0;
	    while((len = fis.read(b)) > 0){
	      fos.write(b);	
	    } // end  while((len = fis.read(b)) > 0)
	    
	  }catch(Exception e){
		e.printStackTrace(); 
	  }
		
	  return Action.SUCCESS;
	} // end execute()

	
	
}
