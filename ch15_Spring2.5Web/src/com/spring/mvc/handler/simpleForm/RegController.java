package com.spring.mvc.handler.simpleForm;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.spring.mvc.model.User;
import com.spring.mvc.service.impl.UserServiceImpl;


/*
 *  �ϥΪ̵n���ɳ汱�
 *  
 *  �j�h�� Web ���γ��|�J��ݭn��g��檺�����A����ǰe���\��A��檺��Ʒ|�Q�ǰe�� Web ���A�����B�z�C
 *  �B�z���\��ɦV�@�Ӧ��\�����A�p�G�ާ@���ѫh�ɦV�@�ӿ��~���i�����C
 *  ���~�A�b����ƳB�z���e�ٷ|�i�����ƪ����ҡA�O�ҥΤ�ݶǰe������ƬO�X�k���Ī��A
 *  �p�G��Ƥ��X�k�A�h�ШD�Ǧ^����歶�����A�H�K�ϥΪ̮ھڿ��~��T�i��ק�C
 */
public class RegController extends SimpleFormController{
  
  /*
  public RegController(){
    // �b�غc��k���A�z�L���w��檫�󪺫��A�A�H�K����۰ʱN����Ƹj�w���檫�󤤡A�]�i�H�����b�]�w�ɤ��z�L commandClass �ݩʶi��]�w�C
    setCommandClass(User.class);    // �]�m���O��H�A�]�٬���檫��  
  }
  */
  
  UserServiceImpl userService;

  public void setUserService(UserServiceImpl userService) {
    this.userService = userService;
  }

  
  /*
   * �B�z���U�ШD
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
   * �B�z���U�ШD
   * 
   * �p�G�ݭn�Ǧ^�ҫ����󵹦��\�����A����N�������s�w�q��汱��� onSubmit() ��k�C
   * 
   * onSubmit() �u���v�j��  doSubmitAction()�A�ҥH�u�n�ھڭn�D���s�w�q��د���@�Ӥ�k�N�i�H�F�C
   * 
   * �b onSubmit() ���Ǧ^�� ModelAndView ���޿��˵��W���ӳz�L��汱��� successView �ݩʫ��w�Ӥ����ӵw�s�X�A�ҥH�z�L getSuccessView() ��k��o�o�ӳ]�w�ȡC
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
