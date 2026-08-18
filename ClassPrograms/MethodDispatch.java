//Dynamic Method Dispatchment

class Parent{
 void display(){
  System.out.println("Welcome to Parent Class...!");
 }
}
class Child extends Parent{
 void display(){
  System.out.println("Welcome to Child Class...!");
 }
}

public class MethodDispatch{
 public static void main(String args[]){
  Parent p=new Parent();// parent class object
  Child c=new Child();// child class object
  Parent ref;// parent class reference
  ref=p;//here ref pointing parent object
  ref.display();
  ref=c;// here ref pointing child object
  ref.display();
  
 }
}