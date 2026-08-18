// program to demonstrate super

class Parent{
 int x;
 Parent(int x)
 {
  this.x=x;
 } 
 void display(){
  System.out.println("Multiplication..."+(x*x));
 }
}
class Child extends Parent{
 int x,y;
 Child(int num1,int num2,int num3){
  super(num1);
  x=num2;
  y=num3;
 }
 void display(){
 super.display();
  System.out.println("Sum..."+(x+super.x+y));
 }
} 

public class AllSuperDemo{
 public static void main(String args[]){
  Child c=new Child(12,16,28);
  c.display();
 }
}