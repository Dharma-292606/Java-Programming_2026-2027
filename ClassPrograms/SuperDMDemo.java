// super for accessing parent class datamember

class Parent{
 int num1;
 Parent(int num1){
  this.num1=num1;
 }
 void display(){
  System.out.println("Welcome to Parent Class..."+num1);
 }
}

class Child extends Parent{
 int num1;
 Child(int x,int y){
  super(x);
  num1=y;
 }
  void show(){
   System.out.println("Welcome to Child Class..."+(super.num1+num1));
  }
}

public class SuperDMDemo{
 public static void main(String args[]){
  Child c=new Child(12,16);
  c.display();
  c.show();
 }
}