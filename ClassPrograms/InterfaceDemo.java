//interface program

interface IntfOne{
 void show();
 void display();
}
class ClassOne implements IntfOne{
 int x,y;
 ClassOne(int x,int y){
  this.x=x;
  this.y=y;
 }
 //overriding abstract method show
 public void show(){
  System.out.println("Value of X:"+x);
 }
 // overriding abstract method display
 public void display(){
  System.out.println("Value of Y:"+y);
 }
 //concerete method in child class
 void printValue(){
  System.out.println("Sum:"+(x+y)); 
 }
}

public class InterfaceDemo{
 public static void main(String args[]){
  ClassOne co=new ClassOne(12,16);
  co.show();
  co.display();
  co.printValue();
 }
}