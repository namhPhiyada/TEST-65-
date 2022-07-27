public class Jordan {
    //datamember
   private String deceased;
   private String infect;
  private String vaccine;
  private String order; 
//Overload
  public Jordan(){
      System.out.println("welcome to jordan");
  }
   public Jordan(String deceased){
     this.deceased = deceased;
  }
  public Jordan(String deceased,String infect){
      this.deceased=deceased;
      this.infect=infect;
}
   public Jordan(String deceased,String infect, String vaccine){
       this.deceased=deceased;
      this.infect=infect;
   this.vaccine=vaccine;
   }
  public Jordan(String deceased,String infect, String vaccine,String order){
      this.deceased=deceased;
      this.infect=infect;
      this.vaccine=vaccine;
      this.order=order;
  }
  ///Mutator Method 
  public void  setDeceased(String deceased){
this.deceased=deceased;
  }
  public void  setInfect(String infect){
this.infect=infect;
  }
  public void  setVaccine(String vaccine){
  this.vaccine=vaccine;
  }
  public void  setOrder(String order){
  this.order=order;
 }
   ///Accessor Method 
  public String getDeceased(){
  return deceased;
  }
  public String getInfect(){
  return infect;
  }
  public String  getVaccine(){
  return vaccine;
  }
  public String  getOrder(){
  return order;
 }
   @Override
  public String toString(){
      String toString = String.format("deceased = %s  \n Infect = %s \nvaccine = %s \n  order = %s", deceased ,infect,vaccine,order);
      return toString;
  }
}
