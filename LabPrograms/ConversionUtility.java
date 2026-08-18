// conversion utility

import java.util.Scanner;
public class ConversionUtility
{
 static double conversion(double feet){
  return feet * 0.3048;
 }
 static double conversion(double mtr,int x){
  return mtr/0.3048;
 }
 static double conversion(double miles,String name){
  return miles * 1.60934;
 }
 static double conversion(String name, double kms){
  return kms/1.60934;
 }
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Measurement Conversion Utility\n1. Feet to Meters\n2. Meters to Feet\n3. Miles to Kilometers\n4. Kilometers to Miles\n5. Exit\nEnter your choice: ");
  int ch=sc.nextInt();
  switch(ch){
   case 1: System.out.println("Enter no. of feets:");
		   double feet=sc.nextDouble();
		   System.out.println(feet+" feets is approximately "+conversion(feet)+" meters");
		   break;
   case 2: System.out.println("Enter no. of meters:");
           double mtr=sc.nextDouble();
		   System.out.println(mtr+" meters is approximately "+conversion(mtr,12)+" feets");
           break;
   case 3: System.out.println("Enter no. of miles:");
           double miles=sc.nextDouble();
		   System.out.println(miles+" miles is approximately "+conversion(miles,"gmrit")+" kilometers");
           break;
   case 4: System.out.println("Enter no. of kilometers:");
           double kms=sc.nextDouble();
		    System.out.println(kms+" kilometers is approximately "+conversion("gmrit",kms)+" miles");
          break;
   case 5: System.out.println("Good BYE...!");
		 break;
   default:System.out.println("Invalid choice....!");break;
  }
 }
}