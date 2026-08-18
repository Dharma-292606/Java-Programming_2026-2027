// Sealed Class Demo

sealed class A permits B,D {
	int x;
	A(int x){
	 this.x=x;
	}
	void display(){
	 System.out.println("In ClassA:"+x);
	}
}
non-sealed class B extends A{
	int y;
	B(int x,int y){
		super(x);
	 this.y=y;
	}
	void show(){
	 System.out.println("In ClassB:"+(x+y));
	}
}
final class D extends A{
	int z;
	D(int x,int z){
		super(x);
	 this.z=z;
	}
	void printVal(){
	 System.out.println("In ClassD:"+(x+z));
	}
}
 /*class C {
	int a;
	C(int a){
	 this.a=a;
	}
	void printDat(){
	 System.out.println("In ClassC:"+(a+y));
	}
}*/
public class SealedDemo{
 public static void main(String args[]){
  B objb=new B(12,16);
  objb.display();
  objb.show();
  D objd=new D(16,28);
  objd.display();
  objd.printVal();
 }
}