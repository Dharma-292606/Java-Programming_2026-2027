
class LibraryBook{
 String title, author;
 int year;
 LibraryBook(String title,String author,int year){
  this.title=title;
  this.author=author;
  this.year=year;
 }
 void displayBookInfo(){
  System.out.println("LibraryBook Details:");
  System.out.println("Title="+title+"\nAuthor="+author+"\nYear="+year);
 }
}
class FictionBook extends LibraryBook{
 String genre;
 FictionBook(String title,String author,int year,String genre){
 super(title,author,year);
 this.genre=genre;
 }
 void displayBookInfo(){
  super.displayBookInfo();
  System.out.println("FictionBook Details:");
  System.out.println("Title="+title+"\nAuthor="+author+"\nYear="+year+"\nGenre="+genre);
 }
 
}
class ClassicBook extends FictionBook{
 String publisher;
 ClassicBook(String title,String author,int year,String genre,String publisher){
 super(title,author,year,genre);
 this.publisher=publisher;
 }
 void displayBookInfo(){
  super.displayBookInfo();
  System.out.println("ClassicBook Details:");
  System.out.println("Title="+title+"\nAuthor="+author+"\nYear="+year+"\nGenre="+genre+"\nPublisher="+publisher);
 }
}
class ScienceFictionBook extends FictionBook{
 int edition;
 ScienceFictionBook(String title,String author,int year,String genre,int edition){
  super(title,author,year,genre);
  this.edition=edition;
 }
 void displayBookInfo(){
  super.displayBookInfo();
  System.out.println("ScienceFictionBook Details:");
  System.out.println("Title="+title+"\nAuthor="+author+"\nYear="+year+"\nGenre="+genre+"\nEdition="+edition);
 }
}

public class LibraryDemo{
 public static void main(String srgw[]){
  ClassicBook cb=new ClassicBook("Bahubali","SS Rajamouli",2015,"Periodic","Arka Media");
  ScienceFictionBook sb=new ScienceFictionBook("Salar","Neel",2023,"Action",1);
  cb.displayBookInfo();
  sb.displayBookInfo();
  
 }
}