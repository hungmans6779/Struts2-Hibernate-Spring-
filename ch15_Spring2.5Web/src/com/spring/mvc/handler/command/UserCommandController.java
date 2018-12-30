package com.spring.mvc.handler.command;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.spring.mvc.model.User;
import com.spring.mvc.service.impl.UserServiceImpl;



/*
 *  請求中包括許多個參數，控制器將請求參數封裝成一個指令物件，據此執行一些業務處理操作處理基於單一表單的請求。
 *  
 *  在 Web 存取中，透過一個或者多個參數使系統傳回特定的結果很常見。例如，根據使用者的 id 來檢視該使用者的個人資訊。
 *   
 *  透過擴充 AbstractCommandController 可以很容易建構出滿足這類別需求的控制器，它能從請求中抽取參數並將其綁定到指令物件中，
 *  控制器只需要根據指令物件進行業務邏輯的控制就可以了。 
 *   
 */
public class UserCommandController extends AbstractCommandController {


  public UserCommandController() {
    setCommandClass(UserCommand.class); // 設定指令物件型態
  }


  private UserServiceImpl userService;


  @Override
  protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response,Object command, BindException errors) throws Exception {

    UserCommand userCommand = (UserCommand) command;
    User user = userService.getUser(userCommand);

    return new ModelAndView("handler/command/userInfo", "user", user);
  } // end handle

  
  
  
  

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }



}
