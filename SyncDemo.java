// Synchronized Thread creation

class Message{
	synchronized void printMsg(String s){
		try{
			for(int i=1;i<=3;i++){
			 System.out.println(s);
			 Thread.sleep(500);
			}
		}
		catch(InterruptedException ie){
		 System.out.println(ie);
		}
		System.out.println("!");
	}
}
class MyThread extends Thread{
	Message m;
	String name;
	MyThread(String s,Message obj){
	 super(s);
	 name=s;
	 m=obj;
	}
	public void run(){
	 m.printMsg(name);
	}
	
}

public class SyncDemo{
 public static void main(String args[]){
  Message m=new Message();
  MyThread t1=new MyThread("Hai",m);
  MyThread t2=new MyThread("Hello",m);
  MyThread t3=new MyThread("Bye",m);
  t1.start();
  t2.start();
  t3.start();
 }
}