package com.spring.mvc.service;

import com.spring.mvc.handler.command.UserCommand;
import com.spring.mvc.handler.upload.UploadBean;
import com.spring.mvc.model.FullUser;
import com.spring.mvc.model.User;


public interface IUserService {

  // ���o�@��ϥΪ̪���
  public User getUser(UserCommand command);

  // ���U�@��ϥΪ�
  public void regUser(User user);

  // �W�[�@��ϥΪ�
  public void addUser(User user);

  // �R���@��ϥΪ�
  public void deleteUser(int id);

  // ���U���ŨϥΪ�
  public void regFullUser(FullUser fu);

  // �x�s�W���ɮ�
  public void saveUpload(UploadBean upBean);
  
}
