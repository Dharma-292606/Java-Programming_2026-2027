// user-defined exception

class MyException extends Exception{
	public String toString(){
		return "What a big number....?";
	}
}

class Sample{
 int x;
 Sample(int x){
  this.x=x;
 }
 void test() throws MyException
 {
  if(x<=100)
   System.out.println("Good...It's OK!");
  else
   throw new MyException();
 }
}

public class UserExceptionDemo{
 public static void main(String argts[]){
  Sample s1=new Sample(12);
  Sample s2=new Sample(101);
  try{
   s1.test();
   s2.test();
  }
  catch(MyException me){
    System.out.println(me);
  }
 }
}