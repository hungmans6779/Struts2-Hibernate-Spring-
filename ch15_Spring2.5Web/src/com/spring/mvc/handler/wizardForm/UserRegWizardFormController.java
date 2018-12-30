package com.spring.mvc.handler.wizardForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.spring.mvc.model.FullUser;
import com.spring.mvc.service.impl.UserServiceImpl;

/*
 * 使用 精靈控制器
 * 
 * 一個系統在使用者註冊模組中需要區別一般使用者和高級使用者， 一般使用者只提供最簡單的資訊，透過一個小表單就可以註冊了。
 * 但對於需要註冊為高級使用者來說，這些使用者一般情況下都是付費的，經營商希望他們提供詳細的註冊資訊，除了使用者名稱、密碼、Email 這些最簡單的資訊外，
 * 還需要提供住址、電話以及興趣愛好之類別的調查資訊，透過一張大表單讓註冊者一次填寫所有這些資訊並不是一個好主意，大部份潛在的使用者當看到這樣的"超級表單"
 * 後都會亳不猶豫地放棄註冊，這時透過一個精靈式的表單讓使用者分步填寫註冊資訊將是明智的方案，雖然需要填寫的信息量不變，但根據心理學的經驗，
 * 使用者會在第一感覺簡單的心理暗示下慢慢進入開發人員設定的"圈套"中，高級使用者註冊所填寫的資訊分解到3個表單中，並以精靈方式分步完成。
 * (1) 填寫使用者名稱、密碼、E-mail 等一般資訊。
 * (2) 填寫地址、電話等關聯資訊。 
 * (3) 填寫使用者興趣愛好和調查資訊。
 */
public class UserRegWizardFormController extends AbstractWizardFormController {

  private String cancelView; // 取消後轉向的檢視(邏輯檢視名
  private String successView; // 精靈最終處理成功後轉向的成功頁面
  private UserServiceImpl userService;


  /*
   * 處理最後傳送表單的動作
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.mvc.AbstractWizardFormController#processFinish(javax.servlet
   * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object,
   * org.springframework.validation.BindException)
   */
  @Override
  protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response,Object command, BindException errors) throws Exception {

    FullUser fu = (FullUser) command;
    userService.regFullUser(fu);
   
    return new ModelAndView(getSuccessView(),"fulluser",fu);  // 註冊成功轉向成功頁面
  } // end  processFinish


  
  

  /*
   * 處理取消動作
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.springframework.web.servlet.mvc.AbstractWizardFormController#processCancel(javax.servlet
   * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object,
   * org.springframework.validation.BindException)
   */
  @Override
  protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response,Object command, BindException errors) throws Exception {

    command = null;
    
    return new ModelAndView(getCancelView());   // 註冊後取消轉向的檢視
  } // end processCancel
  

  



  public String getCancelView() {
    return cancelView;
  }



  public void setCancelView(String cancelView) {
    this.cancelView = cancelView;
  }



  public String getSuccessView() {
    return successView;
  }



  public void setSuccessView(String successView) {
    this.successView = successView;
  }



  public UserServiceImpl getUserService() {
    return userService;
  }



  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }



}
