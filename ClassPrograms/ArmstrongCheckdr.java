//simple java program to check Armstrong Number or not
import java.util.Scanner;
public class ArmstrongCheck{
 static public void main(String gmrt[]){
  int number;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter an Integer Value:"); 
  number=sc.nextInt();
  if(number>0){
     int sum=0;
	 int temp=number;
     while(number!=0){
		int rem=number%10;
		sum=sum+(rem*rem*rem);
		number=number/10;
	 }
	 if(sum==temp)
	  System.out.println("Given Number "+temp+" is ArmStrong.");
	 else
	  System.out.println("Given Number "+temp+" is not Armstrong");
  }
  else{
    System.out.println("Please Enter Positive Integer....!");
  }
 }
}