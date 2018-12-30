package aop.introduction.interceptor.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

import aop.introduction.interceptor.IExecuteTime;

/* 
 * �b�o�ӨҤl���AExecuteTimeImpl ���O������{�F Spring �� IntroductionInterceptor �����A�ӥB��{�F�~�Ȥ��� ExecuteTimeInterface�B
 * �o�Ӧ]�����O�t�d�o�Ӥ�������{�C�]�N�O���������n��{�ޤJ�q���A�ӥB�٭n��{�O������ɶ����\��A�]�Y�V�X�~���޿�C  
 */
public class ExecuteTimeImpl implements IntroductionInterceptor, IExecuteTime {

  /*
   *  ��{ IExecuteTime ����
   */
  public boolean implementsInterface(Class in) {
    return in.isAssignableFrom(IExecuteTime.class);
  }  
  
  // �t�d��{�o�Ӥ�k
  public Object invoke(MethodInvocation mi) throws Throwable {
    
    if(implementsInterface(mi.getMethod().getDeclaringClass())){
      return mi.getMethod().invoke(this,mi.getArguments());  // �I�s�ޤJ����k 
    }else{
      return mi.proceed();                                   // �e�U�䥦����k
    }
  } // end invoke



  public void printExecuteTime() {
    System.out.println("����ɶ��G"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  } // end  printExecuteTime()


}
