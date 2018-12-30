package aop.advisor.statics.advisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import aop.advisor.statics.People;


/*
 *  �e�m�q�����b��k���e�������@�ǰʧ@�A���O��@�ӥؼ����O���h�Ӥ�Ӥ�k�ɡA�p�G�ϥΫe�m�q���A�h�|��C�@�Ӥ�k���ϥΫe�m�q���A
 *  �Ӳ{�b�ݭn���O�u�� speaking() ��k�ϥΫe�m�q���A����L 3�Ӥ�k�h���ϥΡA�o�N�ݭn�w�q�@�ӭ孱�A�ӹL�o���Ǥ��ݭn�ϥΫe�m�q������k�C
 *  �L�o��k�� PeopleAdvisor ���O�A���w�q�����I��k���W�h����� speaking ��k�F���I���O���W�h����� People ���O�Ψ�l���O�C
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
