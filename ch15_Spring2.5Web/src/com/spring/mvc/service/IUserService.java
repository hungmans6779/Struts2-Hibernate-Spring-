package com.spring.mvc.service;

import com.spring.mvc.handler.command.UserCommand;
import com.spring.mvc.handler.upload.UploadBean;
import com.spring.mvc.model.FullUser;
import com.spring.mvc.model.User;


public interface IUserService {

  // 取得一般使用者物件
  public User getUser(UserCommand command);

  // 註冊一般使用者
  public void regUser(User user);

  // 增加一般使用者
  public void addUser(User user);

  // 刪除一般使用者
  public void deleteUser(int id);

  // 註冊高級使用者
  public void regFullUser(FullUser fu);

  // 儲存上傳檔案
  public void saveUpload(UploadBean upBean);
  
}
