// command line arguments

public class CMDDemo{
 public static void main(String args[]){
   System.out.println("Given Command Line Values are:");
   for(int i=0;i<args.length;i++)
    System.out.println("args["+i+"] is"+args[i]);
   System.out.println("Sum="+2*Integer.parseInt(args[0]));
 }
}