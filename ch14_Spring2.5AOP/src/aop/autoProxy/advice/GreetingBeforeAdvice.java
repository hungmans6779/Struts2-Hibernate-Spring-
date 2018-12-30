package aop.autoProxy.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class GreetingBeforeAdvice implements MethodBeforeAdvice {

  public void before(Method method, Object[] args, Object target) throws Throwable {
    System.out.println(GreetingBeforeAdvice.class.getName()+",before()  execute...");
    String customerName = (String) args[0];
    System.out.println("見到您真高興：" + customerName + "，請跟我來！（見面問候）");
    System.out.println("\n");
  } // end before


}
