// Daemon Thread

public class DaemonThread extends Thread{
 public void run(){
  while(true){
	System.out.println("Daemon Thread successfully started....!");
	try{
	 Thread.sleep(1000);
	}
	catch(InterruptedException ie){
	 System.out.println(ie);
	}
  }
 }
 public static void main(String args[]){
  DaemonThread t=new DaemonThread();
  t.setDaemon(true);
  t.start();
  
  System.out.println("Daemon Thread Exited...!");
 }
}