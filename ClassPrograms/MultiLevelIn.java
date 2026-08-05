// Multi Level Inheritance

class GrandParent{
 int num;// instance data member in GrandParent
 void display(){
  System.out.println("Welcome to GrandParent Class..."+num);
 }
}

class Parent extends GrandParent{
 double value;//instance data member in Parent
 void show(){
  System.out.println("Welcome to Parent Class..."+(num+value));
 }
}

class Child extends Parent{
 int num2;//instance data member in Child
 void printInfo(){
  System.out.println("Welcome to Child Class..."+(num+value+num2));
 }
}

public class MultiLevelIn{
 public static void main(String[] args){
  Child obj=new Child();
  obj.num=1216;
  obj.value=12.16;
  obj.num2=1;
  obj.printInfo();
  obj.show();
  obj.display();
 }
}

