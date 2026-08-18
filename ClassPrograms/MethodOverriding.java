// super to achive Method Overriding

class Parent{
 void display(){
  System.out.println("Welcome to Parent Class...!");
 }
}

class Child extends Parent{
 void display(){
  super.display();
  System.out.println("Welcome to Child Class...!");
 }
}

public class MethodOverriding{
 public static void main(String args[]){
  Child c=new Child();
  c.display();
  //c.display();
 }
}