package aop.beforeAdvice.advice;

import org.springframework.asm.commons.Method;

public interface MethodBeforeAdvice {

	  public void before(Method method,Object [] args,Object target);
	  
	}
