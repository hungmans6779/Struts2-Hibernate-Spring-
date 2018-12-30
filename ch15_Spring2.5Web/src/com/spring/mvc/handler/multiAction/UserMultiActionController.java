package com.spring.mvc.handler.multiAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.spring.mvc.model.User;
import com.spring.mvc.service.impl.UserServiceImpl;


/*
    實作多動作控制器 (MultiActionController)
    
    在使用 Spring 控制器時， AbstractController 和 SimpleFormController 是應用得最多的。
    AbstractController 是最基本的 Controller，可以給予使用者大的靈活性。
    SimpleFormController 則用於典型的表單編輯和傳送。
    在一個需要增、刪、改、查的需求中，增加和修改透過擴充 SimpleFormController 完成。
    刪除和查詢則可以透過擴充 AbstractController 完成。
    
    完成某一業務物件的増、刪、改、查，都屬於一個種相關的業務。把一種相關的操作分佈到不同的類別去完成，違反"高內聚"的設計原則。
    這樣 4個業務操作需要4個類別來完成，形成太多的類別檔案，難以維護和設定。
    而 Spring MVC 在一開始就提供了可以完成多動作的 MultiActionController 。 
    MultiActionController 是一個特殊的控制器，可以在同一個控制器中實現多個動作，每個動作分屬不同的方法。
    例如，增加使用者可以對應 addUser() 方法，刪除使用者可以對應 deleteUser() 方法。
 */
public class UserMultiActionController extends MultiActionController {

  private UserServiceImpl userService;

  public UserServiceImpl getUserService() {
    return userService;
  }

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  
  
  
  

  // 增加使用表的方法
  public ModelAndView addUser(HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException{
    System.out.println(UserMultiActionController.class.getName()+",addUser()  execute...");

    String username = ServletRequestUtils.getStringParameter(request,"username");   // 獲得參數 username
    String password = ServletRequestUtils.getStringParameter(request,"password");   // 獲得參數 password
    System.out.println("username = "+username);
    System.out.println("password = "+password);
    System.out.println("\n");
    
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    
    userService.addUser(user);  
    
    return new ModelAndView("handler/multiAction/addUserSuccess","user",user);  // 傳回檢視模型
  } // end addUser
  
  
  
  
  


  // 刪除使用者的方法
  public ModelAndView deleteUser(HttpServletRequest request,HttpServletResponse response) throws ServletRequestBindingException{
    System.out.println(UserMultiActionController.class.getName()+",deleteUser()  execute...");
   
    int uid = ServletRequestUtils.getIntParameter(request,"id");  // 使用者 id
    System.out.println("uid = "+uid);
    System.out.println("\n");
    
    userService.deleteUser(uid);  // 刪除使用者
    
    return new ModelAndView("handler/multiAction/deleteUserSuccess"); // 傳回檢視模型
  } // end deleteUser 

  
  
  
  
  
}
