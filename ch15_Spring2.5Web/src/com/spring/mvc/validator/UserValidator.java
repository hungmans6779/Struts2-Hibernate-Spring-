package com.spring.mvc.validator;

import org.springframework.validation.Errors;

import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.model.User;

/*
 *  ���Ҿ�
 *  
 *  ���Ҫ���� User ����Ȫ��X�k��
 */
public class UserValidator implements Validator {

  
  /* 
   * �P�_���Ҿ��O�_�䴩���w���ؼЪ���A�C�@�����Ҿ��t�d��@�Ӫ�����O������i������C
   * 
   * �p�G���~�a�N UserValidator �Ω��L�������ҡASpring MVC �N�|�ھ� supports() ��k�Ǧ^�ާ@�C
   * 
   * (non-Javadoc)
   * @see org.springframework.validation.Validator#supports(java.lang.Class)
   */
  public boolean supports(Class clazz) {  
    return clazz.equals(User.class);  // �����Ҿ��䴩���ؼ����O
  } // end supports
  

  
  
  
  /*
   * �� target ����i��X�k�����ҡA�z�L Errors �Ǧ^���ҿ��~�����G�C
   *  
   * (non-Javadoc)
   * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
   */
  public void validate(Object target,Errors errors) {
    
    User user = (User)target;
    
    // �z�L Spring �����Ҥu�����O�i��²�����W�h����
    /*
     * ���~����(errors)�G
     * 
     * �������(username)�G��ܸӿ��~�O�����檫�󪺭��@�����ASpring MVC �����~���ҴN�i�H�z�L path �ݩʦs������쪺���~�T���C
     * 
     * ���~�{���X(required.username)�G��ܸӿ��~�����귽�ɤ�����W�ASpring MVC �����~���ҥi�H�ڥ_��o�귽�ɤ��������T���C
     *                                �p�G�Ʊ��{���~�T������ڤơA�N�����z�L���~�{���X���w���~�T���C 
     * 
     * �w�]�T��(�ϥΪ̦W�٥�����g�I)�G��귽�ɨS�����������~�{���X�ɡA�ϥιw�]�T���@�����~�T���C
     * 
     */
    ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","required.username","�ϥΪ̦W�٥�����g�I");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","required.password","�K�X������g�I");

  } // end validate

  
  
}
