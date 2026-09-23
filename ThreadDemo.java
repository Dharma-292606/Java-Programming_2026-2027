/*Thread can be created in two ways:
1. by extending Thread class
2. by implementing Runnable Interface*/

class MyThread extends Thread{
  String name;
  MyThread(String s){
   super(s);
   name=s;
  }
  public void run(){
  try{
   for(int i=1;i<=3;i++){
    System.out.println(name+":"+i);
	sleep(1000);
   }
   }
   catch(InterruptedException ie){
    System.out.println(ie);
   }
  }
}

public class ThreadDemo{
 public static void main(String args[]){
   MyThread t1=new MyThread("Hai");
   MyThread t2=new MyThread("Hello");
   MyThread t3=new MyThread("Bye");
   t1.start();
   t2.start();
   t3.start();
 }
}