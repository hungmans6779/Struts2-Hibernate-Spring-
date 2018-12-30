package com.spring.mvc.handler.command;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.spring.mvc.model.User;
import com.spring.mvc.service.impl.UserServiceImpl;



/*
 *  �ШD���]�A�\�h�ӰѼơA����N�ШD�Ѽƫʸ˦��@�ӫ��O����A�ڦ�����@�Ƿ~�ȳB�z�ާ@�B�z����@��檺�ШD�C
 *  
 *  �b Web �s�����A�z�L�@�өΪ̦h�ӰѼƨϨt�ζǦ^�S�w�����G�ܱ`���C�Ҧp�A�ھڨϥΪ̪� id ���˵��ӨϥΪ̪��ӤH��T�C
 *   
 *  �z�L�X�R AbstractCommandController �i�H�ܮe���غc�X�����o���O�ݨD������A����q�ШD������ѼƨñN��j�w����O���󤤡A
 *  ����u�ݭn�ھګ��O����i��~���޿誺����N�i�H�F�C 
 *   
 */
public class UserCommandController extends AbstractCommandController {


  public UserCommandController() {
    setCommandClass(UserCommand.class); // �]�w���O���󫬺A
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
