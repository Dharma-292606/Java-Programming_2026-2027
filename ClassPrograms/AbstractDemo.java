//Abstract Class

abstract class Parent{
 void display(){
  System.out.println("Abstact Class Concrete Method....!");
 }
 abstract void show();
}

class Child extends Parent{
 void printVal(){
  System.out.println("Child Class Concrete Method....!");
 }
 public void show(){
  System.out.println("Abstract method Overrided from Abstract Class");
 }
}

public class AbstractDemo{
 public static void main(String ars[]){
  Child c=new Child();
  c.display();
  c.show();
  c.printVal();
 }
}