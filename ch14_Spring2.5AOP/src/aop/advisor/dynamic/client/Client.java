package aop.advisor.dynamic.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.dynamic.People;
import aop.advisor.dynamic.PeopleDelegate;

/*
 * 
 *   本例為 ControlFlowPointcut 
 *   
 *   
        由於動態切入點除了要考慮方法的名稱等靜態資訊外，還要考慮方法的參數。由於它是動態的，在執行時既要計算方法的靜態資訊，
    還要計算其參數，結果也不能被快取記憶體。因此，動態切入點要消耗更多的系統資源。
    
    Spring 中提供了如下幾種動態切入點的實現。
    ◆ ControlFlowPointcut：控制流程切入點。例如：只有在某個特定的類別和方法中呼叫某個連接點時，裝備才會被觸發，這時就可以使用 ControlFlowPointcut，
                            但是它的系統消耗很大，在追求高效的應用中，不推薦使用。
    ◆ DynmaicMethodMatcherPointcut：動態方法比對器，是抽象類別，擴充該類別可以實現自己的動態 Pointcut。
    
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
