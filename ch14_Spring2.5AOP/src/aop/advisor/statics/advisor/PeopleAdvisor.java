package aop.advisor.statics.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import aop.advisor.statics.People;


/*
 *  前置通知指在方法之前之完成一些動作，但是當一個目標類別有多個方個方法時，如果使用前置通知，則會對每一個方法都使用前置通知，
 *  而現在需要的是只對 speaking() 方法使用前置通知，對於其他 3個方法則不使用，這就需要定義一個剖面，來過濾那些不需要使用前置通知的方法。
 *  過濾方法的 PeopleAdvisor 類別，它定義的切點方法比對規則為比對 speaking 方法；切點類別比對規則為比對 People 類別或其子類別。
 */
public class PeopleAdvisor extends StaticMethodMatcherPointcutAdvisor {

	public boolean matches(Method method, Class clazz) {
		return "speaking".equals(method.getName());
	} // end matches

	
	public ClassFilter getClassFilter(){
      return new ClassFilter(){
    	public boolean matches(Class clazz){
    	  return People.class.isAssignableFrom(clazz);	
    	}
      };
	} // end getClassFilter()
	
}
