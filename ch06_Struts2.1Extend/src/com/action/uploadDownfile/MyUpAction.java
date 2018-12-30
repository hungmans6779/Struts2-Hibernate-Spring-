package com.action.uploadDownfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/*
       �m�ɮפW�ǡn�G�b Struts2.x ����{�ɮפW�ǡA�ݭn���U�@��"�W�ǸѪR��"�A�}�� struts.properties �]�w�ɡA�i�H�ݨ�ѪR�������U�{���X�C
                   �p�G��椤�]�t�@�� name �ݩʬ� xxx ���ɮװ�A����b Action ���i�H�ϥΦp�U3���ݩʨӫʸ��ɮװ��T�G
                   File xxx             �G�ʸ��ɮװ�������ɮפ��e;
                   String xxxFileName   �G�ʸˤW���ɮת��ɮצW��; 
                   String xxxContentType�G�ʸˤW�Ǫ��ɮ׫��A�F                  
 */
@SuppressWarnings("serial")
public class MyUpAction extends ActionSupport {

	private File upload;              // �ʸˤW���ɮװ쪺�ݩ�
	private String uploadContentType; // �ʸˤW���ɮת����A
	private String uploadFileName;    // �ʸˤW���ɮצW
	private String savePath;          // �ʸ��ɮפW�Ǫ��x�s���|

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

	
	
	// �D��k
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
