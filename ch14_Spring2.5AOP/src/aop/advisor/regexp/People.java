package aop.advisor.regexp;

public class People {
  
  // ����
  public void speaking() {
    System.out.println(People.class.getName()+",speaking() execute....");
    System.out.println("�١I�ڬO�H�ڡI");
    System.out.println("\n");
  }

  
  // �]�B
  public void running() {
    System.out.println(People.class.getName()+",running() execute....");
    System.out.println("�A�ݡA�ڷ|�]...�]�lMM�^");
    System.out.println("\n");
  }

  
  // �ʷR
  public void loving() {
    System.out.println(People.class.getName()+",loving() execute....");
    System.out.println("�ڦb�MMM�ʷR�A�O�ӥ��ͧ�!");
    System.out.println("\n");
  }

  
  // ���`
  public void died() {
    System.out.println(People.class.getName()+",died() execute....");
    System.out.println("�ڼ~�{�Ӧ��I");
    System.out.println("\n");
  }

  
  
}
