package com.spring.mvc.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.spring.mvc.handler.command.UserCommand;
import com.spring.mvc.handler.upload.UploadBean;
import com.spring.mvc.model.FullUser;
import com.spring.mvc.model.User;
import com.spring.mvc.service.IUserService;

public class UserServiceImpl implements IUserService {

  // ���o�@��ϥΪ̪���
  public User getUser(UserCommand command) {
    System.out.println(UserServiceImpl.class.getName() + ",getUser()  execute...");

    User user = new User();
    user.setUid(command.getUid());
    user.setUsername("kevin");
    user.setPassword("1234");
    user.setNowtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

    return user;
  } // end getUser



  // ���U�@��ϥΪ�
  public void regUser(User user) {
    System.out.println(UserServiceImpl.class.getName() + ",regUse()  execute...");
    System.out.println("user = " + user.toString());
    System.out.println("\n");
  }


  // �W�[�@��ϥΪ�
  public void addUser(User user) {
    System.out.println(UserServiceImpl.class.getName() + ",addUser()  execute...");
    System.out.println("user = " + user.toString());
    System.out.println("\n");
  }


  // �R���@��ϥΪ�
  public void deleteUser(int id) {
    System.out.println(UserServiceImpl.class.getName() + ",deleteUser()  execute...");
    System.out.println("id = " + id);
    System.out.println("\n");
  }


  // ���U���ŨϥΪ�
  public void regFullUser(FullUser fu) {
    System.out.println(UserServiceImpl.class.getName() + ",regFullUser()  execute...");
    System.out.println("id:" + fu.getId() + "\nusername:" + fu.getUsername() + "\npassword:"
        + fu.getPassword() + "\nemail:" + fu.getEmail() + "\naddress:" + fu.getAddress() + "\ntel:"
        + fu.getTel() + "\nfavorite:" + fu.getFavor());
    System.out.println("\n");
  }


  // �x�s�W���ɮ�
  public void saveUpload(UploadBean upBean) {
    System.out.println("�x�s��T�B�z.....");
    System.out.println("upBean = "+upBean);
    
  }
  

}
