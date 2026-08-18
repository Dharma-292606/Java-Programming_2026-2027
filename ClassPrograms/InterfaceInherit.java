//interface demo2

interface IntfOne{
 void show();
}
interface IntfTwo extends IntfOne{
 void display();
}
class Child implements IntfTwo{
  public void show(){
   System.out.println("Override method SHOW...!");
  }
  public void display(){
   System.out.println("Override method DISPLAY...!");
  }
}

public class InterfaceInherit{
 public static void main(String args[]){
  Child c=new Child();
  c.show();
  c.display();
 }
}
