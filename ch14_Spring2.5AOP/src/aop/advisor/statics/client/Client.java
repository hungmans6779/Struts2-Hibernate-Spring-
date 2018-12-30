package aop.advisor.statics.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.advisor.statics.People;


/*
 *  使用 Spring 靜態 Pointcut(切入點)
 *     
 *  靜態切入點在代理建立時建立一次，而不是在執行期間每次呼叫方法時都執行，所以性能比動態切入點還好，是首選的切入點方式。
 *  靜態即表示不變，例如方法和類別的名稱。因此可以根據類別和方法的簽名來判定哪些類別的哪些方法在定義的切入點之內、哪些應該被過濾排除。
 *  
 *  在 Spring 中定義了如下兩個靜態切入點的實現類別。    
 *  ◆ StaticMethodMatcherPointcut：一個抽象的靜態 Pointcut，它不能被產生實現。開發者可以自己擴充該類別來實現自訂的切入點。
 *  ◆ NameMatchMethodPointcut：只能對方法名進行判別的靜態 Pointcut 實現類別。
 *  
 *  
 *  本例使用了 StaticMethodMatcherPointcut 的類別。
 *  
 */
public class Client {
	
  public static void main(String[] args) {
		
	ApplicationContext ac = new ClassPathXmlApplicationContext("spring-AOP_PointcutAdivsor.xml");
    System.out.println("\n");
	
	People people = (People)ac.getBean("proxyFactoryBean_StaticMethodMatcherPointcut");
	
	people.speaking();
	people.running();
	people.loving();
	people.died();

  } // end main

  
}
