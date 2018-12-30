package aop.introduction.interceptor.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

import aop.introduction.interceptor.IExecuteTime;

public class ExecuteTimeExtends extends DelegatingIntroductionInterceptor implements IExecuteTime {

  public void printExecuteTime() {
    System.out.println("°õ¦æ®É¶¡¡G"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  }

}
