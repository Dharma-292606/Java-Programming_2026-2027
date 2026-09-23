
public class MultiCatchDemo{
 public static void main(String args[]){
  int a[]={12,16,28,45};
  try{
      System.out.println("Division="+(a[2]/((a[0]+a[1])+a[2])));
	  System.out.println(a[4]);
  }
    catch(ArithmeticException ae){
    System.out.println(ae);
  }
  catch(ArrayIndexOutOfBoundsException ne){
	  System.out.println(ne);
  } 

  System.out.println("Bye");
 }
}