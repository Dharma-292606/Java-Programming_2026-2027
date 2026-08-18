/*super:
  * is the keyword, which is used to provide information from child constructor to parent constructor
  * we can access the supeclass members(data members/member function)
Syntax:
   for constructor- super(parameters_list)  parameters_list must match with the parent class constructor parameters
   for members -  super.datamember when the both datamembers(parent & child) are with same name
                  super.memberfunction() */
 
class Parent{
 int x,y;
 Parent(int a,int b){
  x=a;y=b;
 }
 void display(){
  System.out.println("Parent Sum="+(x+y));
 }
} 
class Child extends Parent{
 int z;
 Child(int a,int b,int c){
  super(a,c);
  z=b;
 }
 void show(){
  System.out.println("Child Sum="+(x+y+z));
 }
}

public class SuperDemo{
 public static void main(String args[]){
  Child ch=new Child(12,16,28);
  ch.display();
  ch.show();
 }
}