package com.spring.mvc.handler.upload;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.util.WebUtils;

import com.spring.mvc.service.impl.UserServiceImpl;

public class UploadController extends SimpleFormController {

  private UserServiceImpl userService;

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  
  
  
  protected ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse resopnse ,Object command,BindException errors) throws Exception{
    
    // 要獲得 Web 應用佈屬根目錄
    String path = WebUtils.getRealPath(request.getSession().getServletContext(),"/");
    System.out.println("kevintest path = "+path);
    
    UploadBean upBean = (UploadBean)command;
    
    // 設定檔案名屬性
    upBean.setFilename(upBean.getAttach().getOriginalFilename());
    
    // 使用 MultipartFile 的 transferTo() 方法將上傳的檔案儲存到 <WebRoot>/upload/目錄下
    String filePath = path+"/upload/"+upBean.getAttach().getOriginalFilename();
    System.out.println("kevintest filePath = "+filePath);
    File file = new File(filePath);
    upBean.getAttach().transferTo(file);
    
    
    userService.saveUpload(upBean);
    
    return new ModelAndView(getSuccessView(),"description",upBean);
  } // end onSubmit
  
 
  
}
