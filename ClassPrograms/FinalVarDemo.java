//using final keyword for variable

class Parent{
 final int val=1216;
 void display(){
  //val=val+12;
  System.out.println("Final Value="+val);
 }
}
class Child extends Parent{
  void display(){
   super.display();
 //  val=val+10;
   System.out.println("Child Value="+val);
  }
}

public class FinalVarDemo{
 public static void main(String args[]){
  Child ch=new Child();
  ch.display();
 }
}

