/*Constructor Overloading:
 *The class have multiple constructors with different paramenters
 *null parameterized constructors must be at fisrt in that row
 1. null parameretized 
 2. parameterized
 3. copy*/
 
// program for constructor overloading

class ClassA{
	int x,y; // instance data members
	//null parameretized constructor
	ClassA(){
		x=12;
		y=16;
	}
	//parameterized constructor
	ClassA(int x,int y){
	    this.x=x;
		this.y=y;
	}
	//copy constructor
	ClassA(ClassA obj1,ClassA obj2){
	    x=obj1.x+obj2.x;
		y=obj1.y+obj2.y;
	}
	void displayValues(){
		System.out.println("X value:"+x+" Y value:"+y);
	}
} 
public class ConstructorOverloading{
	public static void main(String args[]){
		ClassA null_obj=new ClassA();
		null_obj.displayValues();
		ClassA par_obj=new ClassA(28,45);
		par_obj.displayValues();
		ClassA copy_obj=new ClassA(null_obj,par_obj);
		copy_obj.displayValues();
	}
} 