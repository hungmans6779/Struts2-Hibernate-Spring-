package aop.advisor.dynamic;

public class PeopleDelegate {

  private People people;

  public void setPeople(People people) {
    this.people = people;
  }

 
  public void living(){
    people.loving();
    people.died();    
  } // end living
  
  
}
