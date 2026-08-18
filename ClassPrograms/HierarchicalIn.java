// Hierarchical Inheriatane

class Parent{
 void display(){
  System.out.println("Welcome to Parent Class...!");
 }
}

class ChildOne extends Parent{
 void show(){
  System.out.println("Welcome to ChildOne Class...!");
 }
}

class ChildTwo extends Parent{
 void printVal(){
  System.out.println("Welcome to ChildTwo Class...!");
 }
}

public class HierarchicalIn{
 public static void main(String argsp[]){
  ChildOne co=new ChildOne();
  co.show();
  co.display();
  ChildTwo ct=new ChildTwo();
  ct.printVal();
  ct.display();
 }
}