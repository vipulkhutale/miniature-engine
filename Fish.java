package It.Inheritance;

import It.Inheritance.GoldFish;


public class Fish {


 void greeting(){
 
 System.out.println("Greeting");
  
}
  public static void main(String[] args) {

   Guppy g=new Guppy("Black");
   g.display();
   g.greeting();
   
  GoldFish f= new GoldFish(9);
   f.display();
  f.greeting();

  }

}
