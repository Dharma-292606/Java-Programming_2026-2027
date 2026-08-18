//Program for permuations and combination calculator

import java.util.Scanner;

public class PermComb{
 static int fact(int x){
    if(x<=1)
	 return 1;
	else 
	 return x*fact(x-1);
 }
 static int calculatePermutations(int n,int r){
    return fact(n)/fact(n-r);
 }
 static int calculateCombinations(int n,int r){
    return fact(n)/(fact(r)*fact(n-r));
 }
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the total number of elements (n):");
  int n=sc.nextInt();
  System.out.println("Enter the number of elements to be selected (r):");
  int r=sc.nextInt();
  if(n>0&&r>0&&r<=n){
    System.out.println("Permutations (nPr): "+calculatePermutations(n,r));
	System.out.println("Combinations (nCr): "+calculateCombinations(n,r));
  }
  else
   System.out.println("Please provide valid input values....!");
 }
}