// Hybrid Inheritance (sigle+hierarchical)

class Parent{
 void display(){
  System.out.println("Welcome to Parent Class...!");
 }
}

class Child extends Parent{
 void show(){
  System.out.println("Welcome to Child Class...!");
 }
}

class ChildOne extends Child{
 void printVal(){
  System.out.println("Welcome to ChildOne Class...!");
 }
}

class ChildTwo extends Child{
 void printDetails(){
  System.out.println("Welcome to ChildTwo Class...!");
 }
}

public class HybridIn{
 public static void main(String args[]){
  ChildOne co=new ChildOne();
  co.printVal();
  co.show();
  co.display();
  //co.printDetails();
  ChildTwo ct=new ChildTwo();
  ct.printDetails();
  ct.show();
  ct.display();
  //ct.printVal();
 }
}