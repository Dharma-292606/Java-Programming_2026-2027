 class Student{
		    int sid;
			String sname;
			//null parametarized constructor
			Student(){
			  sid=1216;
			  sname="Deepthi";
			}
			//parametarized constructor
			Student(int id,String name){
			  sid=id;
			  sname=name;
			}
			void displayDetails(){
			 System.out.println("Student ID:"+sid+" Student Name:"+sname);
			}
		 }
		 public class ConDemo{
		    public static void main(String args[]){
			  Student s1=new Student();
			  Student s2=new Student(1212,"Raju");
			  s1.displayDetails();
			  s2.displayDetails();
			}
		 }