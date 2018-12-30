package aop.introduction.interceptor.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

import aop.introduction.interceptor.IExecuteTime;

/* 
 * 在這個例子中，ExecuteTimeImpl 類別不但實現了 Spring 的 IntroductionInterceptor 介面，而且實現了業務介面 ExecuteTimeInterface、
 * 這個因為類別負責這個介面的實現。也就是說它不但要實現引入通知，而且還要實現記錄執行時間的功能，也即混合業務邏輯。  
 */
public class ExecuteTimeImpl implements IntroductionInterceptor, IExecuteTime {

  /*
   *  實現 IExecuteTime 介面
   */
  public boolean implementsInterface(Class in) {
    return in.isAssignableFrom(IExecuteTime.class);
  }  
  
  // 負責實現這個方法
  public Object invoke(MethodInvocation mi) throws Throwable {
    
    if(implementsInterface(mi.getMethod().getDeclaringClass())){
      return mi.getMethod().invoke(this,mi.getArguments());  // 呼叫引入的方法 
    }else{
      return mi.proceed();                                   // 委託其它的方法
    }
  } // end invoke



  public void printExecuteTime() {
    System.out.println("執行時間："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  } // end  printExecuteTime()


}
