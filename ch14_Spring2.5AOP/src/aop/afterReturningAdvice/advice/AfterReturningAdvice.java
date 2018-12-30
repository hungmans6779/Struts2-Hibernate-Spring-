package aop.afterReturningAdvice.advice;

import java.lang.reflect.Method;

public interface AfterReturningAdvice {

  void afterReturning(Object returnObj, Method method, Object[] args,Object target);
	
}
