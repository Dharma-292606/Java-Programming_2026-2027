import java.util.*;
public class BankAccountOne{
 private String accountNumber,accountHolderName;
 private double balance;
 BankAccountOne(String accountNumber, String accountHolderName){
  this.accountHolderName=accountHolderName;
  this.accountNumber=accountNumber;
  balance=0.0;
 }
 BankAccountOne(String accountNumber, String accountHolderName, double 
initialBalance){
  this.accountNumber=accountNumber;
  this.accountHolderName=accountHolderName;
  balance=initialBalance;
 }
 void deposit(double amount){
  balance+=amount;
  System.out.printf("$%f is successfully deposit...!\n",amount);
  display();
 }
 void withdraw(double amount){
  if(balance>=amount){
   balance-=amount;
   System.out.printf("$%f is successfully Withdraw...!\n",amount);
   display();
  }
  else
   System.out.println("Insufficient Balance....!");
 }
 void display(){
  System.out.printf("Available Balance is :$%f",balance);
 }
 public static void main(String args[]){
  BankAccountOne bank;
  Scanner sc=new Scanner(System.in);
  System.out.println("Welcome to the Bank Account System \nCreating a new account... ");
  System.out.println("Enter the account holder's name:");
  String name=sc.next();
  System.out.println("Enter the initial balance: ");
  double amount=sc.nextDouble();
  System.out.println("Account Number: ");
  String accno=sc.next();
  if(amount>0){
    bank=new BankAccountOne(accno,name,amount);
	System.out.println("Initial Balance Account created successfully.");
  }
  else{
   bank=new BankAccountOne(accno,name);
   System.out.println("Zero Balance Account created successfully.");
  }
  double value;
  int ch;
  do{
  System.out.println("What would you like to do?\n1. Deposit\n2. Withdraw\n3. Exit\nEnter your choice: ");
  ch=sc.nextInt();
  switch(ch){
   case 1: System.out.println("Enter the amount to deposit: ");
           value=sc.nextDouble();
		   bank.deposit(value);
		   break;   
   case 2:System.out.println("Enter the amount to withdraw: ");
           value=sc.nextDouble();
		   bank.withdraw(value);
		   break;  
   case 3:System.out.println("Thank You...Visit Again!");
          break;
   default:System.out.println("Invalid Choice...!");
	      break;
  }
  }while(ch!=3);
  
 }
}