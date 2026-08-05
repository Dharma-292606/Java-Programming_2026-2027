public class StringDemo{
 public static void main(String args[]){
   String str="Hello";
   str.concat(" World...!");
   System.out.println("Final String is: "+str);
   
   StringBuffer sb=new StringBuffer("Hello");
   sb.append(" World...!");
   System.out.println("Final String is: "+sb);
   
   StringBuilder sbu=new StringBuilder("Hello");
   sbu.append(" World...!");
   System.out.println("Final String is: "+sbu);
 }
}