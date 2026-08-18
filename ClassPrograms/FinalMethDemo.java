//using final Keyword for method

class Parent{
 final void display(){ //error: display() in Child cannot override display() in Parent
  System.out.println("Welcome to Parent Class...!");
 }
}

class Child extends Parent{
 void display(){
  super.display();
  System.out.println("Welcome to Child Class...!");
 }
}

public class FinalMethDemo{
 public static void main(String args[]){
  Child ch=new Child();
  ch.display();
 }
}