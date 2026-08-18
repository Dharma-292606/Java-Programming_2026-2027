//BankAccount using Constructor Overloading
import java.util.*;
public class BankAccount{
 private String accountNumber,accountHolderName;
 private double balance;
 BankAccount(String accountNumber, String accountHolderName){
  this.accountNumber=accountNumber;
  this.accountHolderName=accountHolderName;
  balance=0.0;
 }
 BankAccount(String accountNumber, String accountHolderName, double initialBalance)
 {
  this.accountNumber=accountNumber;
  this.accountHolderName=accountHolderName;
  balance=initialBalance;
 }
 void deposit(double amount){
  if(amount>0){
	  balance+=amount;
	  System.out.printf("$%f amount successfully deposit....!\n",amount);
	  display();
  }
  else
	 System.out.println("Invalid amout....!");
 }
 void withdraw(double amount){
  if(amount<=balance){
	  balance-=amount;
	  System.out.printf("$%f amount successfully withdraw....!\n",amount);
	  display();
  }
  else
	  System.out.println("Sorry,Insufficient Amount....!");
 }
 void display(){
   System.out.printf("Available Balance is $%f",balance);
 }
 public static void main(String args[]){
  System.out.println("Welcome to the Bank Account System \n Creating a new account... ");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the account holder's name:");
  String accountHolderName=sc.next();
  System.out.println("Enter the initial balance:");
  double amount=sc.nextDouble();
  System.out.println("Account Number: ");
  String accountNumber=sc.next();
  BankAccount min;
  if(amount>0){
    min=new BankAccount(accountNumber,accountHolderName,amount);
	System.out.println("Account created successfully. ");
  }
  else{
    min=new BankAccount(accountNumber,accountHolderName);
	System.out.println("Account created successfully. ");
  }
  double amtValue;
  int ch;
  do{
   System.out.println("What would you like to do?\n1. Deposit\n2. Withdraw\n3. Exit\nEnter your choice:  ");  
   ch=sc.nextInt();
   switch(ch){
    case 1: System.out.println("Enter the amount to deposit: ");
	        amtValue=sc.nextDouble();
			min.deposit(amtValue);
		break;
	case 2:System.out.println("Enter the amount to withdraw: ");
	        amtValue=sc.nextDouble();
			min.withdraw(amtValue);
		break;
	case 3:System.out.println("Thank You...Visit Again!");
		break;
	default:System.out.println("Invalid Choice......!");
   }
  }while(ch!=3);
 
 }
}