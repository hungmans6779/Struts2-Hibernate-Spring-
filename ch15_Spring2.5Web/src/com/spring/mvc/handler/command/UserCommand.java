package com.spring.mvc.handler.command;


/*
 * �� ���g���O����A���F���O����~�i�H��K�a�ϥΰѼơC
 * 
 * �Ѧ��{���X�i�H�ݥX�Acommand �ɤJ�ѼƬ۷�� Struts1.x �� ActionForm�A ���P���O command �ȬO�@�� POJO �A���ݭn��{����S�������C
 * 
 * �ѩ� UserCommand �u���@�� uid ���ݩʡA�o��ܦp�G URL �ШD�����@�ӥs�� uid ���ѼơA���򥦪��ȱN�]�w����O���� uid �ݩʤ��C
 * �ҡGhttp://localhost:8080/ch15_Spring2.5Web/userCommand.mvc?uid=00001
 */
public class UserCommand {

  private int uid;   // �ѼƦW��


  /*
   *  ��o�ѼƭȪ���k
   */
  public int getUid() {
    return uid;
  }

  
  /*
   *  �]�w�ѼƭȪ���k
   */
  public void setUid(int uid) {
    this.uid = uid;
  }


}
