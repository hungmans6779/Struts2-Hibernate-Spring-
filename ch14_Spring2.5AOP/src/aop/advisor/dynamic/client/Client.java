package aop.advisor.dynamic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.dynamic.People;
import aop.advisor.dynamic.PeopleDelegate;

/*
 * 
 *   ���Ҭ� ControlFlowPointcut 
 *   
 *   
        �ѩ�ʺA���J�I���F�n�Ҽ{��k���W�ٵ��R�A��T�~�A�٭n�Ҽ{��k���ѼơC�ѩ󥦬O�ʺA���A�b����ɬJ�n�p���k���R�A��T�A
    �٭n�p���ѼơA���G�]����Q�֨��O����C�]���A�ʺA���J�I�n���ӧ�h���t�θ귽�C
    
    Spring �����ѤF�p�U�X�ذʺA���J�I����{�C
    �� ControlFlowPointcut�G����y�{���J�I�C�Ҧp�G�u���b�Y�ӯS�w�����O�M��k���I�s�Y�ӳs���I�ɡA�˳Ƥ~�|�QĲ�o�A�o�ɴN�i�H�ϥ� ControlFlowPointcut�A
                            ���O�����t�ή��ӫܤj�A�b�l�D���Ī����Τ��A�����˨ϥΡC
    �� DynmaicMethodMatcherPointcut�G�ʺA��k��ﾹ�A�O��H���O�A�X�R�����O�i�H��{�ۤv���ʺA Pointcut�C
    
 */
public class Client {
  
   public static void main(String [] args){
     
     ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_PointcutAdivsor.xml");
     System.out.println("\n");
     
     People people = (People) ac.getBean("proxyFactoryBean_DefaultPointcutAdvisor");
     
     people.speaking();
     
     people.running();
     
     people.loving();
     
     people.died();
     
     
     
     PeopleDelegate pd = new PeopleDelegate();
     pd.setPeople(people);
     pd.living();
     
     
   }
   
}
