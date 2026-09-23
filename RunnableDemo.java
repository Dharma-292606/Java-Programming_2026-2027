// thread creation using Runnable interface

class MyThread implements Runnable{
 String name;
 Thread t;
 MyThread(String s){
  t=new Thread(this,s);
  t.start();
  name=s;
 }
 public void run(){
  try{
   for(int i=1;i<=3;i++){
    System.out.println(name+":"+i);
	Thread.sleep(500);
   }
  }
  catch(InterruptedException ie){
   System.out.println(ie);
  }
 }
}

public class RunnableDemo{
 public static void main(String args[]){
  MyThread t1=new MyThread("Hai");
  MyThread t2=new MyThread("Hello");
  MyThread t3=new MyThread("Bye");
 }
}