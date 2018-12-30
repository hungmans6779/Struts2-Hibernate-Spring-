package com.spring.mvc.handler.simpleForm;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.model.User;
import com.spring.mvc.service.impl.UserServiceImpl;


/*
 *  使用者登錄檔單控制器
 *  
 *  大多數 Web 應用都會遇到需要填寫表單的頁面，當表單傳送成功後，表單的資料會被傳送到 Web 伺服器中處理。
 *  處理成功後導向一個成功頁面，如果操作失敗則導向一個錯誤報告頁面。
 *  此外，在表單資料處理之前還會進行表單資料的驗證，保證用戶端傳送的表單資料是合法有效的，
 *  如果資料不合法，則請求傳回到原表單頁面中，以便使用者根據錯誤資訊進行修改。
 */
public class RegController extends SimpleFormController{
  
  /*
  public RegController(){
    // 在建構方法內，透過指定表單物件的型態，以便控制器自動將表單資料綁定到表單物件中，也可以直接在設定檔中透過 commandClass 屬性進行設定。
    setCommandClass(User.class);    // 設置指令對象，也稱為表單物件  
  }
  */
  
  UserServiceImpl userService;

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  
  /*
   * 處理註冊請求
   * (non-Javadoc)
   * @see org.springframework.web.servlet.mvc.SimpleFormController#doSubmitAction(java.lang.Object)
   */
  /*  
  protected void doSubmitAction(Object command){
    System.out.println(RegController.class.getName()+",doSubmitAction()  execute...");
    System.out.println("\n");
    
    User user = (User)command;
    userService.regUser(user);
  }
  */
  
  
  /*
   * 處理註冊請求
   * 
   * 如果需要傳回模型物件給成功頁面，那麼就必須重新定義表單控制器的 onSubmit() 方法。
   * 
   * onSubmit() 優先權大於  doSubmitAction()，所以只要根據要求重新定義兩堹的一個方法就可以了。
   * 
   * 在 onSubmit() 中傳回的 ModelAndView 的邏輯檢視名應該透過表單控制器的 successView 屬性指定而不應該硬編碼，所以透過 getSuccessView() 方法獲得這個設定值。
   *
   * (non-Javadoc)
   * @see org.springframework.web.servlet.mvc.SimpleFormController#doSubmitAction(java.lang.Object)
   */
  protected ModelAndView onSubmit(Object command,BindException errors){
    System.out.println(RegController.class.getName()+",onSubmit() execute...");
    System.out.println("\n");
    
    User user = (User) command;
    userService.regUser(user);
    
    return new ModelAndView(getSuccessView(),"user",user);
  } // end onSubmit
  
  
  
  
  
  
}
