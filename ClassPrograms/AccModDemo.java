

class ClassA{
  private int num1;
  protected int num2;
  int num3;
  public int num4;
  void displayInfo(){
   System.out.println("NUM1:"+num1+" NUM2:"+num2+" NUM3:"+num3+" NUM4"+num4);
  }
}
//main class
public class AccModDemo{
 public static void main(String args[])
 {
   ClassA obj=new ClassA();
   obj.num1=12; // error: num1 declared as private in ClassA
   obj.num2=16;
   obj.num3=28;
   obj.num4=45;
   obj.displayInfo();
}