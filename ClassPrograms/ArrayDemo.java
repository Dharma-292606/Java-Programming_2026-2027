/*Arrays: is a collection of similar data items in sequential format under single name
syntax:
       <datatype> <arrayName>[]=new <datatype>[<size>];
ex:
    int arr[][]=new int[4][3];
	int[] arr=new int[4];
	int []arr=new int[4];
	
	
	int arr[][]=new int[3][5];
	arr[0]=new int[2];
	arr[1]=new int[3];
	arr[2]=new int[2];
	
	int arr[]={12,16,28,45};
	arr.length*/

public class ArrayDemo{
 public static void main(String args[]){
  int arr[]={12,16,28,45,6,19};
  System.out.println("Array Elements are:");
  for(int i=0;i<arr.length;i++)
   System.out.println("arr["+i+"] : "+arr[i]);
 } 
}
	