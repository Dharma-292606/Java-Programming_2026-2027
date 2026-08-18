//using final Keyword for Class

final class Parent{ 
 void display(){
  System.out.println("Welcome to Parent Class...!");
 }
}

class Child extends Parent{//error: cannot inherit from final Parent
 void display(){
  super.display();
  System.out.println("Welcome to Child Class...!");
 }
}

public class FinalClassDemo{
 public static void main(String args[]){
  Child ch=new Child();
  ch.display();
 }
}