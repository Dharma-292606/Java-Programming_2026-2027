import java.util.*;
public class ExceptionDemo{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int num1=0,num2=0;
  try{
  System.out.println("Enter value for NUM1");
  num1=s.nextInt();
  System.out.println("Enter value for NUM2");
  num2=s.nextInt();
  }
  catch(InputMismatchException ne){
	  System.out.println(ne);
  }
  try{
   System.out.println("Division="+(num1/num2));
  }
  catch(ArithmeticException ae){
    System.out.println(ae);
  }
  System.out.println("Bye");
 }
}