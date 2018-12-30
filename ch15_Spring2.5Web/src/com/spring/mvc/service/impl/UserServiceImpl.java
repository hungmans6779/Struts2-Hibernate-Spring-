package com.spring.mvc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.spring.mvc.handler.command.UserCommand;
import com.spring.mvc.handler.upload.UploadBean;
import com.spring.mvc.model.FullUser;
import com.spring.mvc.model.User;
import com.spring.mvc.service.IUserService;

public class UserServiceImpl implements IUserService {

  // 取得一般使用者物件
  public User getUser(UserCommand command) {
    System.out.println(UserServiceImpl.class.getName() + ",getUser()  execute...");

    User user = new User();
    user.setUid(command.getUid());
    user.setUsername("kevin");
    user.setPassword("1234");
    user.setNowtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

    return user;
  } // end getUser



  // 註冊一般使用者
  public void regUser(User user) {
    System.out.println(UserServiceImpl.class.getName() + ",regUse()  execute...");
    System.out.println("user = " + user.toString());
    System.out.println("\n");
  }


  // 增加一般使用者
  public void addUser(User user) {
    System.out.println(UserServiceImpl.class.getName() + ",addUser()  execute...");
    System.out.println("user = " + user.toString());
    System.out.println("\n");
  }


  // 刪除一般使用者
  public void deleteUser(int id) {
    System.out.println(UserServiceImpl.class.getName() + ",deleteUser()  execute...");
    System.out.println("id = " + id);
    System.out.println("\n");
  }


  // 註冊高級使用者
  public void regFullUser(FullUser fu) {
    System.out.println(UserServiceImpl.class.getName() + ",regFullUser()  execute...");
    System.out.println("id:" + fu.getId() + "\nusername:" + fu.getUsername() + "\npassword:"
        + fu.getPassword() + "\nemail:" + fu.getEmail() + "\naddress:" + fu.getAddress() + "\ntel:"
        + fu.getTel() + "\nfavorite:" + fu.getFavor());
    System.out.println("\n");
  }


  // 儲存上傳檔案
  public void saveUpload(UploadBean upBean) {
    System.out.println("儲存資訊處理.....");
    System.out.println("upBean = "+upBean);
    
  }
  

}
