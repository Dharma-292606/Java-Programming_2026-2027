// Single Inheritance

class Base{
  int num; //instante data member in base 
  void display(){
	System.out.println("Welcome to Base Class..."+num);
  }
}

class Derived extends Base{
	double value;// instance data member in derived class
	void show(){
	 System.out.println("Welcome to Derived Class..."+(num+value));
	}
}

public class SingleIn{
	public static void main(String args[]){
	  Derived obj=new Derived();
	  Scanner sc=new Scanner(System.in);
	  obj.num=1216;
	  obj.value=12.16;
	  obj.display(); // base property
	  obj.show(); // derived property
	}
}

