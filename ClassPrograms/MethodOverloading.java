//Method Overloading

class ClassA{
  void display(){
    System.out.println("Without RT Without Parameters");
  }
  String display(int x){
     return "With RT Without Parameters";
  }
  void display(int x,int y){
   System.out.println("Without RT With Parameter");
  }
  String display(int y,double x){
	return "With RT With Parameters";
  }
}

public class MethodOverloading{
 public static void main(String args[]){
  ClassA ca=new ClassA();
  System.out.println(ca.display(12));
  ca.display(12,16);
  System.out.println(ca.display(12,16.5));
  ca.display();
 }
}

