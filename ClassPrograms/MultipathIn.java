// Multiple Inheritance

class ParentOne{
 void display(){
  System.out.println("Welcome to ParentOne Class...!");
 }
}

class ParentTwo{
 void show(){
  System.out.println("Welcome to ParentTwo Class...!");
 }
}

class Child extends ParentOne,ParentTwo //error:'{' expected
{
 void printVal(){
  System.out.println("Welcome to Child Class...!");
 }
}

public class MultipathIn{
 public static void main(String args[]){
  Child obj=new Child();
  obj.printVal();
  obj.display();
  obj.show();
 }
}
