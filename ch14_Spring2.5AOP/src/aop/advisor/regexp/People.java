package aop.advisor.regexp;

public class People {
  
  // 講話
  public void speaking() {
    System.out.println(People.class.getName()+",speaking() execute....");
    System.out.println("嗨！我是人啊！");
    System.out.println("\n");
  }

  
  // 跑步
  public void running() {
    System.out.println(People.class.getName()+",running() execute....");
    System.out.println("你看，我會跑...（追MM）");
    System.out.println("\n");
  }

  
  // 戀愛
  public void loving() {
    System.out.println(People.class.getName()+",loving() execute....");
    System.out.println("我在和MM戀愛，別來打攪我!");
    System.out.println("\n");
  }

  
  // 死亡
  public void died() {
    System.out.println(People.class.getName()+",died() execute....");
    System.out.println("我憂鬱而死！");
    System.out.println("\n");
  }

  
  
}
