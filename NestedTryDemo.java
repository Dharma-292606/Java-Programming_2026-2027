// Nested try block

public class NestedTryDemo{
 public static void main(String args[]){
  try{
     int arr[]={12,16,28,0};
	 try{
	   int result=arr[1]/arr[2];
	   System.out.println("Result="+result);
	   System.out.println("Value at Position 5="+arr[4]);
	 }
	 catch(ArithmeticException ae){
			System.out.println(ae);
	 }
  }
  catch(Exception e){
    System.out.println(e);
  }
 }
}